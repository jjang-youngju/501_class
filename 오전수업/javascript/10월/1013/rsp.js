

user();

function user(){// 유저
var u = parseInt(prompt("1.가위 2.바위 3.보"))
var c = com();
result(u,c)
}
function com(){//컴
var c = Math.floor(Math.random()*3)+1;
return c;
}
function result(u,c){//가위바위보 결과
if(u==c){ //u와 c가 똑같을때
    alert("비김");
}else if((u==1 && c==3)||(u==2 && c==1) ||(u==3 && c==2)){ //u=가위c=보,u=바위c=가위,u=보c=바위일때
    alert("이김");
}else{// 나머지
    alert("짐");
}
}