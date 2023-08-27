//지역 선택
const select_si_gun_gu = document.querySelectorAll(".recomend-select-si-gun-gu");
const select_si_gun_gu2 = document.querySelector("#recomend-select-JN");
const select_si_do = document.querySelector(".recomend-select-si-do");

select_si_do.addEventListener("change", ()=>{
    for(let i=0; i<select_si_do.length; i++){
        select_si_gun_gu[i].classList.add("display_none")
        select_si_gun_gu[i].classList.remove("display_show")
        select_si_gun_gu[i].selectedIndex = null
    }
    select_si_gun_gu[select_si_do.selectedIndex].classList.remove("display_none")
})

//지역작물 조회
const select_btn = document.querySelector(".select-btn");
const select_result = document.querySelectorAll(".JN-result");
const select_view = document.querySelectorAll(".recomend-view");
const result_text = document.querySelector(".textBox");



select_btn.addEventListener("click",()=>{
    for(let i=0; i<select_result.length; i++){
        if(select_si_gun_gu2.selectedIndex==i+1){
            result_text.style.display="none";
            for(let j=0; j<select_result.length; j++){
                select_view[j].style.display="none";
            }
            select_view[i].style.display="block";
            result_text.style.display="flex";
        }
    }
});


