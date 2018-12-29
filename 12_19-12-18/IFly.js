var Plane = /** @class */ (function () {
    function Plane(pilotName, airlineName, destination) {
        this.pilotName = pilotName;
        this.airlineName = airlineName;
        this.destination = destination;
    }
    Object.defineProperty(Plane.prototype, "pilotName", {
        get: function () {
            return this._pilotName;
        },
        set: function (pilotName) {
            this._pilotName = pilotName;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Plane.prototype, "airlineName", {
        get: function () {
            return this._airlineName;
        },
        set: function (airlineName) {
            this._airlineName = airlineName;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Plane.prototype, "destination", {
        get: function () {
            return this._destination;
        },
        set: function (destination) {
            this._destination = destination;
        },
        enumerable: true,
        configurable: true
    });
    Plane.prototype.fly = function (speed) {
        console.log("I am flying " + speed + " mph");
    };
    Plane.prototype.land = function () {
        console.log("I landed successfully");
        return true;
    };
    Plane.prototype.toString = function () {
        return "pilotName: " + this.pilotName + ", airlineName: " + this.airlineName + ", destination: " + this.destination;
    };
    Plane.prototype.myType = function () {
        return "Plane";
    };
    return Plane;
}());
var Kite = /** @class */ (function () {
    function Kite(color, price) {
        this.color = color;
        this.price = price;
    }
    Object.defineProperty(Kite.prototype, "color", {
        get: function () {
            return this._color;
        },
        set: function (color) {
            this._color = color;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Kite.prototype, "price", {
        get: function () {
            return this._price;
        },
        set: function (price) {
            this._price = (price > 0) ? price : 0;
        },
        enumerable: true,
        configurable: true
    });
    Kite.prototype.fly = function (speed) {
        console.log("I am flying " + speed + " mph");
    };
    Kite.prototype.land = function () {
        console.log("I landed successfully");
        return true;
    };
    Kite.prototype.toString = function () {
        return "Price: " + this.price + ", Color: " + this.color;
    };
    Kite.prototype.myType = function () {
        return "Kite";
    };
    return Kite;
}());
var Bird = /** @class */ (function () {
    function Bird(type, age, color) {
        this.type = type;
        this.age = age;
        this.color = color;
    }
    Object.defineProperty(Bird.prototype, "type", {
        get: function () {
            return this._type;
        },
        set: function (type) {
            this._type = type;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Bird.prototype, "age", {
        get: function () {
            return this._age;
        },
        set: function (age) {
            this._age = (age > 0) ? age : 0;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Bird.prototype, "color", {
        get: function () {
            return this._color;
        },
        set: function (color) {
            this._color = color;
        },
        enumerable: true,
        configurable: true
    });
    Bird.prototype.fly = function (speed) {
        console.log("I am flying " + speed + " mph");
    };
    Bird.prototype.land = function () {
        console.log("I landed successfully");
        return true;
    };
    Bird.prototype.toString = function () {
        return "Type: " + this.type + ", Age: " + this.age + ", Color: " + this.color;
    };
    Bird.prototype.myType = function () {
        return "Bird";
    };
    return Bird;
}());
function createFly() {
    var num = Math.floor(Math.random() * 3);
    var obj;
    switch (num) {
        case 0: {
            return obj = new Bird("pashosh", Math.floor(Math.random() * 10), "red");
        }
        case 1: {
            return obj = new Plane("Bob", "Iberia", "Spain");
        }
        case 2: {
            return obj = new Kite("Yelow", Math.floor(Math.random() * 200));
        }
        default: {
            return null;
        }
    }
}
var IFlyArray = new Array(10);
for (var index = 0; index < IFlyArray.length; index++) {
    IFlyArray[index] = createFly();
    console.log(IFlyArray[index].myType() + " created");
}
for (var index = 0; index < IFlyArray.length; index++) {
    console.log(index + 1 + ". " + IFlyArray[index].myType());
    IFlyArray[index].fly(Math.floor(Math.random() * 120));
    console.log(IFlyArray[index].land());
}
