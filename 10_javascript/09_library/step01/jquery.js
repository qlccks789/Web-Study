var $ = mlec;

function mlec(val) {
    var element = [];
    for (let el of document.querySelectorAll(val)) {
        element.push(el);
    }
    return element;
}