app.controller('indexController',function ($scope,loginService) {

    //显示登录名
    $scope.showLoginName=function () {
        loginService.loginName().success(
            function (response) {
                $scope.loginName=response.loginName;
            }
        )
    }
})