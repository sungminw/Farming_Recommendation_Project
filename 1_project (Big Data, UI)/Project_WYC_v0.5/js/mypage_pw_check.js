const submit_button = document.querySelector("#submit_button")
const member_info_box_update = document.querySelector(".member_info_box_update")
const member_info_box = document.querySelector(".member_info_box")


const pw_check_form = document.querySelector(".pw_check_form")
const result = "true";

submit_button.addEventListener("click", (result)=>{
  pw_check_form.submit();
  alert("sasdasdas")
  document.location.href="mypage.html?result="+result
  // member_info_box_update.classList.remove('dis_none')
  // member_info_box.classList.add('dis_none')
})