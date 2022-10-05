
// addEventListener는 태그에 이벤트 설정하는 함수
// addEventListener("이벤트",이벤트 발생시 동작함수)
// 직접함수를 만드는 방법   add.addEventListener("이벤트",function(){}) 제어가 쉬움
// 별도로 함수를 만드는 방법 add.addEventListener("이벤트",tag_add)
//                          function tag_add(){} 제어하는데 힘듦이 있음
window.onload = function () {
    var add = document.querySelector("#add");
    add.addEventListener("click", tag_add);
};

var add_check = false;

function tag_add() {
    if (add_check) {
        return;
    }
    add_check = true;
    var Pdiv = document.querySelector("#score_wrap");
    var div = document.createElement("div");


    var ipt = document.createElement("input");  //input태그 생성
    ipt.setAttribute("type", "text"); //input 태그 type지정
    ipt.setAttribute("id", "name");  //input 태그 id지정
    ipt.setAttribute("placeholder", "이름"); //input 태그 placeholder지정
    div.appendChild(ipt); //div 태그 자식으로 ipt 추가

    //2차원배열? 국어→0번째 배열안에 0번째,kor→ 0번째 배열안에 1번째
    var course = [["국어", "kor"], ["수학", "mat"], ["영어", "eng"]];
    //course=[0][0]
    for (let i = 0; i < 3; i++) {
        ipt = document.createElement("input");//input태그 생성
        ipt.setAttribute("type", "number");//input 태그 type지정
        ipt.setAttribute("id", course[i][1]);//input 태그 id지정
        ipt.setAttribute('placeholder', course[i][0]);//input 태그 placeholder지정
        div.appendChild(ipt);//div 태그 자식으로 ipt 추가
    }
    var bt = document.createElement("button");
    bt.addEventListener("click", enroll);
    var text = document.createTextNode('등록');
    bt.appendChild(text);

    div.appendChild(bt);
    // input 태그들을 새 div에 넣고 score_wrap에 추가학기

    Pdiv.appendChild(div); //score_wrap div에 추가
}

function enroll() {
    add_check = false;
    var name = document.querySelector("#name").value; //name값 불러오기
    var kor = document.querySelector("#kor").value; // kor값 불러오기
    var mat = document.querySelector("#mat").value; //mat값 불러오기
    var eng = document.querySelector("#eng").value; // eng값 불러오기

    var Pdiv = document.querySelector("#score_wrap");

    //score_wrap div에 추가 하는 작업
    var div = document.createElement("div");
    div.setAttribute("class", "score");

    var data = [name, kor, mat, eng];
    for (let i in data) { //input태그에 입력된 값을 h3태그에 삽입
        let h = document.createElement("h3"); //h3태그생성
        let text = document.createTextNode(data[i]);
        h.appendChild(text);
        div.appendChild(h);
    }
    var input = Pdiv.lastChild;
    Pdiv.removeChild(input); //input태그 삭제

    Pdiv.appendChild(div); //input 태그값 div에 삽입
}