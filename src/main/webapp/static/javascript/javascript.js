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
  this.style.borderRadius = "40px";
}

function ripristinasfondo () {
  this.style.backgroundColor = "#000000";
  this.style.borderRadius = "40px";
}

$(document).ready(function () {
  $("#createaccount").click(function () {
    $("#containerloginform").hide();
    $("#containerregistrationform").show();
 });
    $("#no").click(function () {
      $("#secondcontainer").hide();
      $("#thirdcontainer").show();
    });
      $("#yes").click(function () {
        $("#thirdcontainer").hide();
        $("#secondcontainer").show();
      });
  });





