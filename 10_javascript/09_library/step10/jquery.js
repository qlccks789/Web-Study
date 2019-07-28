var $ = mlec;

function mlec(val) {
    var element = [];

    switch (val.charAt(0)) {
        case "<":
            element[0] = 
                document.createElement( val.substring(1, val.length - 1) );
            break;
        default:
            for (let el of document.querySelectorAll(val)) {
                element.push(el);
            }
    }

    element.remove = function () {
        for (let el of this) {
            el.remove();
        }
    };

    element.append = function (childs) {
        for (let el of this) {

            for (let child of childs) {
                el.appendChild(child.cloneNode(true));
            }

        }
        return this;
    };

    element.css = function (name, value) {
        if (typeof (name) === "object") {
            for (let el of this) {

                for (let key in name) {
                    el.style[key] = name[key];
                }

            }
            return this;
        }

        if (value != undefined) {
            for (let el of this) {
                el.style[name] = value;
            }
            return this;
        }

        return this[0].style[name];    
    };

    element.attr = function (name, value) {
        if (typeof (name) === "object") {
            for (let el of this) {

                for (let key in name) {
                    el.setAttribute(key, name[key]);
                }

            }
            return this;
        }

        if (value != undefined) {
            for (let el of this) {
                el.setAttribute(name, value);
            }
            return this;
        }

        return this[0].getAttribute(name);    
    };

    element.click = function (cb) {
        return this.on("click", cb);
    };

    element.mousemove = function (cb) {
        return this.on("mousemove", cb);
    };

    element.on = function (eventType, cb) {
        for (let el of this) {
            el.addEventListener(eventType, cb);
        }
        return this;
    };

    element.val = function (value) {
        if (value != undefined) {
            for (let el of this) {
                el.value = value;
            }
            return this;
        }

        return this[0].value;
    };

    element.html = function (html) {
        if (html != undefined) {
            for (let el of this) {
                el.innerHTML = html;
            }
            return this;
        }
        
        return this[0].innerHTML;
    };

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

    return element;
}

