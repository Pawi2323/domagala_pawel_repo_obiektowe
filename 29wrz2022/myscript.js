function kolor(color){
    var kolo = $('#dot');
    switch (color) {
        case "white":
            kolo.css("background-color", "white");
            break;
        
        case "black":
            kolo.css("background-color", "black");
            break;
                    
        case "green":
            kolo.css("background-color", "green");
            break;
                    
        case "blue":
            kolo.css("background-color", "blue");
            break;
                    
        case "red":
            kolo.css("background-color", "red");
            break;
    
        default:
            break;
    }
};