// controles das paginas individuais

var stateController = {
    role : {
        name : "visitante",
    },
};

(function(data){
    
    var controllers = angular.module('homeUnivilleControllers', []);
    
    controllers.controller ('RoleDialogCtrl', [
        "$scope",
        function ($scope) {
            $scope.stCtrl = stateController;
            
            $scope.chooseRole = function (role) {
                stateController.role.name = role;
                
                jQuery('.choose-role-dlg').hide();
                jQuery(".web-content").show();
            };
        }
    ]);
    
    controllers.controller ('HomeShowcaseCtrl', [
        "$scope",
        function ($scope){
            
            $scope.agenda = data.agenda;
            $scope.intervalTime = 5000;
            $scope.noWrapSlides = false;
            $scope.banners = data.banners;
        }
    ]);
    
    controllers.controller ('CategoryPageCtrl', [
        "$scope",
        function ($scope){
            
            $scope.pages = data.pages;
            $scope.pagesById = [];
            
            for(var key in $scope.pages) {
                $scope.pagesById[$scope.pages[key].id] = $scope.pages[key];
                $scope.pages[key].cDescription = $scope.pages[key].description;
                
                for(var c in $scope.pages[key].children) {
                    $scope.pages[key].children[c].cDescription = $scope.pages[key].children[c].description;
                    
                    if (!$scope.pages[key].children[c].link || $scope.pages[key].children[c].link == '')
                        $scope.pages[key].children[c].hasLink = false;
                    else
                        $scope.pages[key].children[c].hasLink = true;
                }
            }
            
            $scope.detailPage = function (page, index) {
                var currentPage = jQuery('#' + page.id + ' .page-content');
                var subPage = jQuery('#' + page.id + ' .sb-' + index);
                
                currentPage.height(0);
                subPage.height('600px');
            };
            
            $scope.backTo = function (page) {
                
                var backPage = jQuery('#' + page.id + ' .page-content');
                var subPages = jQuery('#' + page.id + ' .sub-pages');
                
                backPage.height('600px');
                subPages.height(0);                
            };
            
            $scope.descriptionSet = function (page, index) {
                if (index == -1) {
                    page.cDescription = page.description;
                } else {
                    page.cDescription = page.children[index].description;
                }
                
                page.cDescription = page.cDescription.replace('\n', '<br/>');
            };
        }
    ]);
    
    controllers.controller ('TopMenuCtrl', [
        "$scope",
        function ($scope){

            $scope.role = stateController.role;
            $scope.items = [];
            
            $scope.items.push({
                'label' : "DESTAQUES",
                'anchor' : "banners",
            });
            
            for(var key in data.pages) {
                
                if (data.pages[key].label != "Rodapé") {
                    $scope.items.push({
                        'label' : data.pages[key].label,
                        'anchor' : data.pages[key].id,
                    });
                }
            }
            
            $scope.resetContents = function () {
                var backPage = jQuery('.page-content');
                var subPages = jQuery('.sub-pages');
                
                backPage.height('600px');
                subPages.height(0);    
            }
        }
    ]);
})(data);