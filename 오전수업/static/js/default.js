$(document).ready(function(){
    $(".menu-toggle").on("click",function(){
        $(".gnb").stop().slideToggle('fast');
    });
});

// 시간설정 가능, fast,slow
// show(); 숨겨진게 보임
// hide(); 숨겨지는
// toggle(); 숨겨지는거 보이는거 둘다 가능
// fadein(); 화면에서 보여짐 (투명도)
// fadeout();화면에서 안보여짐(투명도)
// slideup();
// slidedown();
// slideToggle(); slideup,down 합친거