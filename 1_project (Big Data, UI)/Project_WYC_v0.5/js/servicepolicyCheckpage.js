// 모달 창 기능
const open = document.querySelector(".policy_detail");
const modalBox = document.querySelector("#modal_box");
const close = document.querySelector("#modal_close");

open.addEventListener("click", () => {
    modalBox.classList.toggle("active");
});

close.addEventListener("click", () => {
    modalBox.classList.toggle("active");
});

window.addEventListener("keyup", e => {
  if(modalBox.style.display === "flex" && e.key === "Escape") {
      modalBox.style.display = "none"
  }
})

function policy_detail_modal(){
  modalBox.classList.toggle("active");
}


// 지역 셀렉 박스 기능
const select_sigungu = document.querySelectorAll(".select_sigungu")
const select_si_do = document.querySelector("#select_si_do")

select_si_do.addEventListener("change", ()=>{
    for(let i=0; i<select_si_do.length; i++){
      select_sigungu[i].classList.add("display_hide")
      select_sigungu[i].classList.remove("display_show")
      select_sigungu[i].selectedIndex = null
    }
    select_sigungu[select_si_do.selectedIndex].classList.remove("display_hide")
})



// 검색 기능
const policy_tr = document.querySelectorAll(".policy_tr")

function filter(){

  const value_filter = document.querySelector("#search_text").value.toUpperCase();

  for(let i=0;i<policy_tr.length;i++){
    const name = policy_tr[i].querySelector(".policy_title_name");
    if(name.innerHTML.toUpperCase().indexOf(value_filter) > -1){
      policy_tr[i].style.display = "";
    }else{
      policy_tr[i].style.display = "none";
    }
  }
}

// 시도 셀렉트
const policy_sido = document.querySelectorAll(".policy_sido")

function select_sido_fun() {
    const value_sido = select_si_do[select_si_do.selectedIndex].innerHTML

    for(let i=0; i<policy_sido.length; i++){
      if(value_sido == policy_tr[i].querySelector(".policy_sido").innerHTML){
        policy_tr[i].style.display = "";
      }else{
        policy_tr[i].style.display = "none";
      }
    }
}

// 시군구 셀렉트
const policy_sigungu = document.querySelectorAll(".policy_sigungu")

function select_sigungu_fun() {
    const value_sigungu = select_sigungu[select_si_do.selectedIndex][select_sigungu[select_si_do.selectedIndex].selectedIndex].innerHTML

    if(select_si_do.selectedIndex == 0){
      for(let j=0; j<policy_tr.length; j++){
        policy_tr[j].style.display = "";
      }
    } else{
    for(let i=0; i<10; i++){
      const sigungu = policy_tr[i].querySelector(".policy_sigungu").innerHTML
      // if(value_sigungu == policy_tr[i].children[2].querySelector(".policy_sigungu").innerHTML){
      if(value_sigungu == sigungu){
        policy_tr[i].style.display = "";
      }else{
        policy_tr[i].style.display = "none";
      }
    }
  }

}

function total(){
  const value_filter = document.querySelector("#search_text").value.toUpperCase();
  const value_sido = select_si_do[select_si_do.selectedIndex].innerHTML
  const value_sigungu = select_sigungu[select_si_do.selectedIndex][select_sigungu[select_si_do.selectedIndex].selectedIndex].innerHTML

  
  if(!select_sigungu[select_si_do.selectedIndex].selectedIndex == 0 || !value_filter == '' || !select_si_do.selectedIndex == 0){
    if(select_sigungu[select_si_do.selectedIndex].selectedIndex ==0 && value_filter == '' && !select_si_do.selectedIndex==0){
      // 시도만 선택 시
      select_sido_fun();
    }else if(!select_sigungu[select_si_do.selectedIndex].selectedIndex ==0 && value_filter == '' && !select_si_do.selectedIndex==0){
      // 시도, 시군구 선택시
      select_sigungu_fun();
    }else if(!select_sigungu[select_si_do.selectedIndex].selectedIndex ==0 && !value_filter == '' && !select_si_do.selectedIndex==0){
      // 시도, 시군구, 검색 모두 입력 시
      for(let i=0; i<policy_tr.length; i++){
        const name = policy_tr[i].querySelector(".policy_title_name");
        if(value_sigungu == policy_tr[i].children[2].innerHTML && name.innerHTML.toUpperCase().indexOf(value_filter) > -1){
          policy_tr[i].style.display = "";
        }else{
          policy_tr[i].style.display = "none";
        }
      }
    }else if(select_sigungu[select_si_do.selectedIndex].selectedIndex ==0 && !value_filter == '' && select_si_do.selectedIndex==0){
      // 검색만 입력시
      filter();
    }else if(select_sigungu[select_si_do.selectedIndex].selectedIndex ==0 && !value_filter == '' && !select_si_do.selectedIndex==0){
      for(let i=0; i<policy_tr.length; i++){
        const name = policy_tr[i].querySelector(".policy_title_name");
        if(value_sido == policy_tr[i].children[1].innerHTML && name.innerHTML.toUpperCase().indexOf(value_filter) > -1){
          policy_tr[i].style.display = "";
        }else{
          policy_tr[i].style.display = "none";
        }
      }
    }
  }else{
    for(let k=0; k<policy_tr.length; k++){
      policy_tr[k].style.display="";
    }
  }
}



const row_count = document.querySelector(".row_count")

row_count.innerHTML = policy_tr.length;