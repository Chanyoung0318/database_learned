window.onload=function(){
    var sliderImgs = document.getElementById("mySlider").getAttribute("data-imglist");

    sliderImgs = eval(sliderImgs);
    console.log(sliderImgs);
    console.log(sliderImgs[0]);

    var mySlider = document.getElementById("holder");
    var index = 0;

    document.getElementById("prev").addEventListener("click", function(){
        if(index==0){
            index=sliderImgs.length;
        }
        index=index-1;
        mySlider.src = sliderImgs[index];
        return false;
    })
    document.getElementById("next").addEventListener("click", function(){
        index = index+1;
        index=index%sliderImgs.length;
        mySlider.src = sliderImgs[index];
    })
}