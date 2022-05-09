a <- readline(prompt = "Enter a number ")
b <- readline(prompt = "Enter a number ")
c <- readline(prompt = "Enter a number ")
if (a<b){
	if(a<c){
		cat(a,"is smaller")
	}else{
		cat(c,"is smaller")
	}
}else{
	if(b<c){
		cat(b,"is smaller")
	}else{
		cat(c,"is smaller")
	}
}
