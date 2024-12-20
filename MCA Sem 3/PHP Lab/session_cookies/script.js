function validatephone() {
    var phone = document.getElementById("ph").value;
    var phoneRegex = /^[0-9]{10}$/;
    if (!phoneRegex.test(phone)) {
        alert("Invalid Phone No.");
        document.getElementById("ph").focus();
        return false;
    }
    return true;
}

function validatemail() {
    let regex = /^[a-z0-9]+@[a-z]+\.[a-z]{2,3}$/;
    var email = document.getElementById("email").value;
    if (regex.test(email) == false) {
        alert("Invalid Email Id");
        document.getElementById("email").focus();
        return false;
    }
    return true;
}

function validatepass() {
    let val = /^(?=.*\d)(?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])(?=.*[!@#$%^&*()\-+.]).{8,20}$/;
    var password = document.getElementById("psw").value;
    if (val.test(password) == false) {
        alert("Invalid Password");
        document.getElementById("psw").focus();
        return false;
    }

    if (password.length < 8 || password.length > 20)
        return false;

    return true;
}

function validateForm() {
    if ((validatephone() && validatemail() && validatepass())) {
        return true;
    }
    else {
        return false;
    }
}