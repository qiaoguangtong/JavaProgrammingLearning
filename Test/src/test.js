<script type="text/javascript">

// 下拉框

var selectFlag=false;

function selectShow(){

var contentDom=document.getElementsByClassName("drop-down-content")[0];

var imgDOM=document.getElementById("reasontxt");

selectFlag=!selectFlag;

// 展开

if(selectFlag){

contentDom.className=contentDom.className +" " + "active";

imgDOM.className="bgimg-up";

}else{

contentDom.className="drop-down-content";

imgDOM.className="bgimg-down";

}

}

// 监听选择退款原因点击事件

function selector(){

var ul=document.querySelectorAll(".drop-down ul")[0]

ul.addEventListener('click',function(e){

var el=e.target

while(el.tagName!=='LI'){

if(el==ul){

el=null;

break;

}

el=el.parentNode

}

if (el) {F
document.getElementById("reasontxt").innerHTML=el.innerHTML
}

},false)

}

window.onload=function(){

selector()

}

</script>