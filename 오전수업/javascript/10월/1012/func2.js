// func2.js
/*
html 작업
1. input 1개 생성(생년월일입력 : 1999.01.02)
    너비 200, 높이 35, 폰트 17
2. 버튼 1개 생성
    입력, 너비100, 높이 37, 폰트 15
3. div#birthday 생성
4. div#birthday 하위 태그로 ul태그 생성
5. ul 태그 하위로 li태그 3개
    (각 li에 태어난년도 , 태어난 월, 나이)

자바스크립트 작업
1. 버튼 이벤트 생성, 함수 input
2. input함수에서 value값 가져오고 출력
3. getYear함수 (태어난년도 구하기)
4. getMonth함수 (태어난월 구하기)
5. getAge 함수 (나이 구하기)

*/
window.onload = function () {
    document.getElementById("bt").addEventListener("click", input);
}

function input() {
    var birth = document.getElementById("birth").value;

    var birth_year = getYear(birth);
    var birth_month = getMonth(birth);
    var age = getAge(birth);

    var info = document.getElementsByClassName("info");
    info[0].innerHTML = birth_year;
    info[1].innerHTML = birth_month;
    info[3].innerHTML = age;
}
function getMonth(birth) {
    month = birth.split(".")[1];
    return month;
}
function getYear(birth) {
    year = birth.split(".")[0];
    return year;
}
function getAge(birth) {
    year = birth.split(".");
    age = 2022 - parseInt(year) + 1;
    return age;
}