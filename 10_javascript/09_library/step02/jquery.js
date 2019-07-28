var $ = mlec;

function mlec(val) {
    var element = [];
    for (let el of document.querySelectorAll(val)) {
        element.push(el);
    }

    // ===============================
    // step02 추가
    element.html = function (html) {
        if (html != undefined) {
            for (let el of this) {
                el.innerHTML = html;
            }
            return this;
        }
        
        return this[0].innerHTML;
    };
    // ===============================

    return element;
}