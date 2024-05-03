

function validationLogin(){
        var login = document.querySelector('#Username').value;
        var senha = document.querySelector('#Password').value;
        
        if(login == "admin" && senha == "123"){
                location.href = "index.html"
        }else{
                alert("Invalid login");
        }
}

