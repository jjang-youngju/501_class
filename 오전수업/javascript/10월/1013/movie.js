
window.onload = function () {
    var input = document.getElementsByClassName("movie");
    for (var i in input) {
        input[i].addEventListener("focus", function () {
            this.classList.add("active");
        });
        input[i].addEventListener("blur", function () {
            this.classList.remove("active");
        });
    }
}

// 객체 : 사물, 사람, 동물등 대표성을 지닌 독립적인 존재
/*
    모든 객체는 자신만의 속성(특징)을 가지며, 자신만의 행동을 갖는다.
    객체는 자신만의 속성을 가진다. → 변수
    객체는 자신만의 행동을 갖는다. → 함수

    객체정의 : 추상화시켜 놓은 것
    추상화의 기본 : 속성과 행동을 나열하고 구성한다.
    멤버변수 : 객체의 속성을 구성
    멤버함수 : 객체의 속성을 기반으로 행동을 구현해놓은 코드

    객체생성 : new 연산자를 통해서 생성
    생성된 객체는 변수에 저장하여 사용하는데 이때 변수를 참조변수라고 한다.

*/

var obj = new Object();