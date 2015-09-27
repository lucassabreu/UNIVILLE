// funções para geração de tela dinâmica

var app = angular.module("homeUnivilleApp", ['homeUnivilleControllers', 'ui.bootstrap']);

var stateController = {};

// other controls

jQuery(function() {

    // control    
    stateController.setRoleName = function (name) {
        if (!this.role)
            this.role = {};
        
        this.role.name = name;

        if (!this.user)
            this.user = {};
        
        this.user.role = this.role;
            
        Cookies.set('userStatus', this.user);
    }
    
    var us = Cookies.getJSON("userStatus");
    
    if (us) {
        stateController.user = us;
        stateController.role = us.role;
        
        if (us.logged)
            stateController.userLogged = true;
    }
    
    // smoth scroll
    jQuery('a[href*=#]:not([href=#])').click(function() {
        if (location.pathname.replace(/^\//,'') == this.pathname.replace(/^\//,'') && location.hostname == this.hostname) {
            var target = $(this.hash);
            target = target.length ? target : $('[name=' + this.hash.slice(1) +']');
            if (target.length) {
                jQuery('html,body').animate({
                    scrollTop: target.offset().top
                }, 1000);
                return false;
            }
        }
    });
    
    // highlighting links
    var pages = [];

    // Grab positions of our sections 
    jQuery('.page').each(function(){
        pages.push({
            id : this.id,
            element : this,
        });
    });
    
    jQuery('.nav-items a:first').addClass('active');
    
    jQuery(document).scroll(function(){
        
        var middle = (jQuery(this).scrollTop() * 2 + jQuery(window).height()) / 2;

        // Look in the sections object and see if any section is viewable on the screen. 
        // If two are viewable, the lower one will be the active one. 
        
        for(var i in pages){
            var page = pages[i];
            
            page.top = jQuery(page.element).offset().top;
            page.bottom = page.top + jQuery(page.element).height();
            
            if(page.top <= middle && page.bottom >= middle){
                jQuery('.nav-items a').removeClass('active');
                jQuery('a[href=#' + page.id + ']').addClass('active');
            }  
        }
    });

    // controles para "responsivilidade"
    var cssHeights = {
        page : '790px',
        pageContents : '730px',
        banners : '490px',
    };
    
    jQuery('.page').css('height', cssHeights.page);
    jQuery('.page-content').css('height', cssHeights.pageContents);
    jQuery('.page.home-show-case .banners img, .page.home-show-case .banners').css('height', cssHeights.banners);

    if (stateController.role) {
        jQuery(".web-content").show();
        jQuery('.choose-role-dlg').hide();
    } else {
        jQuery('.choose-role-dlg').show();
        jQuery(".web-content").hide();
    }
});
