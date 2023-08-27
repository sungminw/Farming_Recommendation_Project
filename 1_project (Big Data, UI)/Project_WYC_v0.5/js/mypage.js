const jangsung_strawberry_salse = document.querySelector(".jangsung_strawberry_salse")
const jangsung_strawberry_salse_detail = document.querySelector("#jangsung_strawberry_salse_detail")

jangsung_strawberry_salse.addEventListener("click", ()=>{
  jangsung_strawberry_salse_detail.classList.toggle("dis_none");
})

// ---------------------------------------------
const salse_detail = document.querySelectorAll(".salse_detail")

function sales_detail(index){
  salse_detail[index].classList.toggle('dis_none');
}


const cost_detail = document.querySelectorAll(".cost_detail")

function detail_table(index){
  cost_detail[index].classList.toggle('dis_none');
}


// function sales_detail() {
//   // const salse_detail = document.querySelector(".salse_detail");
//   const sali = document.querySelector(".sali");

//   sali.children[0].classList.toggle('dis_none');
// }

// const correction_btn = document.querySelector("#correction_btn")
// const member_info_box_update = document.querySelector(".member_info_box_update")

// correction_btn.addEventListener("click", ()=>{
//   member_info_box_update.classList.remove
// })

// window.onload = function(){
//   const result = request.getParameter(result);
//   console.log(result)
// }

