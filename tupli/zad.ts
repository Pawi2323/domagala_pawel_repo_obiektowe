let a = 0;
let b = 0;

enum oceny{
    niedostateczny = 1,
    dopuszczajacy = 2,
    dostateczny = 3,
    dobry = 4,
    bardzo_dobry = 5,
    celujacy = 6
}

let przedmioty = ['matematyka',
'polski', 
'angielski',
'angielski',
'niemiecki',
'historia',
'chemia',
'biologia',
'geografia',
'fizyka'];

type tuple = [string, string, number, number];

function random(){
    let r = Math.floor(Math.random() * a)+b;
    console.log(r);
    return r;
}