$('#btn_show_hide').click(function(){
   let title = $(this).text()
   if(title=='HIDE'){
    $('#btn_show_hide').text('SHOW')
    //$('#para').slideUp(2000);
   }
   else{
    $('#btn_show_hide').text('HIDE') 
    //$('#para').slideDown(2000);
   }
   $('#para').slideToggle(2000);

   
   // $('#para').hide(2000);
})