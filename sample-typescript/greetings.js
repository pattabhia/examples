var Greetings = /** @class */ (function () {
    function Greetings() {
    }
    Greetings.prototype.greet = function () {
        var message = "testme";
        console.log("greetings " + message);
    };
    return Greetings;
}());
var obj = new Greetings();
obj.greet();
