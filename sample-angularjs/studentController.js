mainApp.controller('studentController', function($scope) {
    $scope.student = {
        firstName: "Pattabhi",
        lastName: "A",
        fullName: function() {
            var studentObject;
            studentObject = $scope.student;
            return studentObject.firstName + " " + studentObject.lastName;
        },
        subjects: [{
                name: 'Economic',
                marks: 70
            },
            {
                name: 'Chemistry',
                marks: 80
            },
            {
                name: 'Math',
                marks: 65
            }
        ]
    };
});