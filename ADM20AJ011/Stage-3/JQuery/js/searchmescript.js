let paraText = $("p").text();
console.log(paraText)

let newParaText = paraText.split(" ").join("</span> <span>")
newParaText = '<span>' + newParaText + '</span>'
console.log(newParaText)

$('p').html(newParaText)
      .find($('span'))
       .hover(function(){       
          //$(this).addClass('marker')    
          $(this).css('background-color','bisque')
          let word = $(this).text()
          //if(word.indexOf("th")>-1){
          if(word.includes("th")){    
            $(this).css({
                'text-shadow':'2px 2px pink',
                'font-style':'italic',
                'font-weight':'bolder'
            })
          }  
       }, function(){
          //$(this).removeClass('marker')     
          $(this).css('background-color','white')
       })
       .end()
       /*
       .find(":contains('th')")
       .css({
           'text-shadow':'2px 2px pink',
           'font-style':'italic',
           'font-weight':'bolder'
       })
       */
/*
$("span").mouseover(function () {
    $(this).css({ "background-color": "bisque" });
});

$("span").mouseout(function () {
    $(this).css({ "background-color": "white" });
});
*/