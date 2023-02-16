"use strict";
let a = 0;
let b = 0;
var oceny;
(function (oceny) {
    oceny[oceny["niedostateczny"] = 1] = "niedostateczny";
    oceny[oceny["dopuszczajacy"] = 2] = "dopuszczajacy";
    oceny[oceny["dostateczny"] = 3] = "dostateczny";
    oceny[oceny["dobry"] = 4] = "dobry";
    oceny[oceny["bardzo_dobry"] = 5] = "bardzo_dobry";
    oceny[oceny["celujacy"] = 6] = "celujacy";
})(oceny || (oceny = {}));
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
function random() {
    let r = Math.floor(Math.random() * a) + b;
    console.log(r);
    return r;
}
