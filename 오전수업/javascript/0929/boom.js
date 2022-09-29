// boom.js

var board = new Array(400);
board.fill(0); //배열에 채우기 

for(var i =0; i<200;){
    let pos = Math.floor(Math.random()*400);
    if(board[pos]!=1){
        board[pos] = 1;
        i++;
    }
}

window.onload = function(){
    var table = "<table>";
    for(var i=0; i<20;i++){
        table += "<tr>";
        for(var k =0; k<20;k++){
            if(board[i*20+k]==1)
                table += '<td><img src ="../../image/boom-removebg-preview.png"></td>'
            else
                table += "<td></td>"
        }
        table += "</tr>";
    }
    document.getElementById("wrap").innerHTML = table;
}