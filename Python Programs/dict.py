dict={
	"First Name": "Soumyadeep",
	"Surname": "Banerjee",
	"Education": ["ST", "DMHSS", ("BGC","WBSU")]

}

print(dict) #{'First Name': 'Soumyadeep', 'Surname': 'Banerjee', 'Education': ['ST', 'DMHSS', ('BGC', 'WBSU')]}
print(dict["First Name"]) #Soumyadeep
print(dict["Education"]) #['ST', 'DMHSS', ('BGC', 'WBSU')]
print(dict["Education"][1]) #DMHSS
print(dict["Education"][2]) #('BGC', 'WBSU')
print(dict["Education"][2][1]) #WBSU
