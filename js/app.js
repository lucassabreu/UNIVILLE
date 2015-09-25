// funções para geração de tela dinâmica

var app = angular.module("homeUnivilleApp", ['homeUnivilleControllers', 'ui.bootstrap']);

// other controls

jQuery(function() {
    
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
    $('.page').each(function(){
        pages[this.id] = $(this).offset().top;
    });

    $(document).scroll(function(){
        var pos = $(this).scrollTop();

        // Look in the sections object and see if any section is viewable on the screen. 
        // If two are viewable, the lower one will be the active one. 
        for(var id in pages){
            if(pages[id] > pos && pages[id] < pos + jQuery(window).height()){
                console.log(id);
                jQuery('.nav-items a').removeClass('active');
                jQuery('#' + id).addClass('active');
            }  
        }
    });

    // controles para "responsivilidade"
    var cssHeights = {
        page : '790px',
        pageContents : '730px',
        banners : '640px',
    };
    
    jQuery('.page').css('height', cssHeights.page);
    jQuery('.page-content').css('height', cssHeights.pageContents);
    jQuery('.page.home-show-case .banners img, .page.home-show-case .banners').css('height', cssHeights.banners);

    jQuery(".web-content").hide();
});
