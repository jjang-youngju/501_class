// boom.js

var board = new Array(400);
board.fill(0); //배열에 채우기 

//폭탄의 위치를 정해주는 식
for(var i =0; i<398;){
    let pos = Math.floor(Math.random()*400);
    if(board[pos]!=1){
        board[pos] = 1; //**중요 **
        i++;            //**중요 **
    }
}

window.onload = function(){
    var table = "<table>";
    for(var i=0; i<20;i++){
        table += "<tr>";
        for(var k =0; k<20;k++){
                table += '<td class="bm" data-idx='+( i * 20 + k )+'></td>';
        }
        table += "</tr>";
    }
    document.getElementById("wrap").innerHTML = table;
    //클래스명이 bm인 것들을 전부 다 찾음(배열로 가져오게됨)
    var bm = document.getElementsByClassName('bm'); 
    //alert(bm.length);
    // bm[0].style.background = 'red';
    for(var i in bm){
        bm[i].addEventListener('click',function(){
            let n = this.dataset.idx;
            if(board[n] == 1){
                this.style.background =
                    'url(../../../image/boom.png) no-repeat center center';
                    this.style.backgroundSize = 'cover';
                    //this.innerHTML = "<img src='../../image/boom.png'>";
            }else this.style.background = 'rgb(230,230,230)'; //this = bm[i]
            //alert("td 클릭");
            //js에서 스타일 다룰때는 꼭 문자열("",'')로 입력
            
        });
    }

};