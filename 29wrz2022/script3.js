$(document).ready(function() {
    var number=0;
    $("#gora").click(function() {
      $("div").animate({'top': '-=20'},"fast",);
    });
    
    $("#dol").click(function() {
      $("div").animate({'bottom': '-=20'},"fast",);
    });
    
    $("#lewo").click(function() {
      $("div").animate({'left': '-=20'},"fast",);
    });
    
    $("#prawo").click(function() {
      $("div").animate({'right': '-=20'},"fast",);
    });
    $("#obrot").click(function() {
      number += 90
      $("div").css({'transform': 'rotate('+number+'deg)'});
    });
  });