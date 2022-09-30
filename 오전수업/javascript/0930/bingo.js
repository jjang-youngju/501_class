
var bingo = new Array();

while(bingo.length !=25){
    let num = Math.floor(Math.random()*100)+1;
    if( bingo.indexOf(num)==-1){
        bingo.push(num);
    }
}

window.onload = function(){
    var td = document.querySelectorAll(".box");

    for(var i=0; i<td.length; i++){
        td[i].innerHTML = bingo[i];
        td[i].addEventListener('click',function(){

            this.style.background = 'lightgreen';
            check(this.innerHTML);
        });
    }
};

function check(n){
    //체크 한 숫자를 빙고배열에서 제외시키기
    for(let i in bingo){
        if(bingo[i]==n){//선택한 숫자를 배열에서 찾기
            bingo[i]=0;
            break;
        }
    }

    //5줄 빙고 확인
    var wd = 0, hg = 0, cr1=0, cr2=0, end=0;
    for(var i = 0; i < 5; i++){
        for(var k = 0; k < 5; k++){
            if( bingo[i*5+k] == 0) wd++; //줄에 0이 몇개냐
            if( bingo[k*5+i] == 0) hg++;
        }
        if(bingo[i*6]==0) cr1++;// 왼쪽위 시작대각선
        if(bingo[i*4+4]==0) cr2++;
        if(cr2 == 5) end++;
        if(cr1 == 5) end++;
        if(wd == 5) end++; // 한줄에 0이 5개라면 1줄빙고
        if(hg == 5) end++;

        hg = 0; //다음줄 0개수를 확인하기위해 초기화
        wd = 0;
    }
    if(end == 5) alert('빙고!!!!!!!!!!!!!!');
}