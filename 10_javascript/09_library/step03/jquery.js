var $ = mlec;

function mlec(val) {
    var element = [];
    for (let el of document.querySelectorAll(val)) {
        element.push(el);
    }

    element.html = function (html) {
        if (html != undefined) {
            for (let el of this) {
                el.innerHTML = html;
            }
            return this;
        }
        
        return this[0].innerHTML;
    };

    // =============================
    // step03 추가 - innerText 처리
    // text(값), text()
    element.text = function (text) {
        if (text != undefined) {
            for (let el of this) {
                el.innerText = text;
            }
            return this;
        }
        let result = "";
        for (let el of this) {
            result += el.innerText + "\n";
        }
        return result;
    };
    // =============================

    return element;
}

