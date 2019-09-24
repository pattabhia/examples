var mainApp = angular.module("myapp", ['ngRoute']);
mainApp.config(['$routeProvider', function($routeProvider) {
    $routeProvider.

    when('/addStudent', {
        templateUrl: 'addStudent.html',
        controller: 'AddStudentController'
    }).

    when('/viewStudents', {
        templateUrl: 'viewStudents.html',
        controller: 'ViewStudentsController'
    }).

    otherwise({
        redirectTo: '/addStudent'
    });
}]);

mainApp.controller('AddStudentController', function($scope) {
    $scope.message = "This page will be used to display add student form";
});


mainApp.controller('ViewStudentsController', function($scope) {
    $scope.message = "This page will be used to display all the students";
});



