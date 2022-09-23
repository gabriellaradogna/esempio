const nav_li1 = document.getElementById("nav_li1");
const nav_li2 = document.getElementById("nav_li2");
const nav_li3 = document.getElementById("nav_li3");
const nav_li4 = document.getElementById("nav_li4");
const nav_li5 = document.getElementById("nav_li5");

nav_li1.addEventListener("mouseover",sfondo);
nav_li1.addEventListener("mouseout", ripristinasfondo);
nav_li2.addEventListener("mouseover",sfondo);
nav_li2.addEventListener("mouseout", ripristinasfondo);
nav_li3.addEventListener("mouseover",sfondo);
nav_li3.addEventListener("mouseout", ripristinasfondo);
nav_li4.addEventListener("mouseover",sfondo);
nav_li4.addEventListener("mouseout", ripristinasfondo);
nav_li5.addEventListener("mouseover",sfondo);
nav_li5.addEventListener("mouseout", ripristinasfondo);
function sfondo () {
  this.style.backgroundColor = "#333333";
}

function ripristinasfondo () {
  this.style.backgroundColor = "#000000";
}

$(document).ready(function () {

  $("#editpassword").click( function () {
   $("#passwordcontainer").show();
   $("#editpassword").css("background-color", "#ffffff")
  });

   $("#noleggio, #editdati,#supporto").click( function () {
     $("#editpassword").css("background-color","");
     $("#passwordcontainer").hide();
 });
  $("#editdati").click( function () {
    $("#containerregistrationform").show();
    $("#editdati").css("background-color", "#ffffff")
  });
  $("#noleggio, #editpassword,#supporto").click( function () {
    $("#editdati").css("background-color","");
    $("#containerregistrationform").hide();
  });

  $("#noleggio").click(function () {
    $("#containerimgauto, #containerdettagli").show();
    $("#noleggio").css("background-color", "#ffffff")
  });
  $("#editdati, #editpassword,#supporto").click( function () {
    $("#noleggio").css("background-color","");
    $("#containerimgauto,#containerdettagli").hide();
  });
  $("#supporto").click( function () {
    $("#supporto").css("background-color", "#ffffff")
  });

  $("#editdati, #editpassword,#noleggio").click( function () {
    $("#supporto").css("background-color","");
  });
});
