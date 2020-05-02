
(()=>{
  const magicGrid = new MagicGrid({
    container: '.games_list',
    animate: true,
    gutter: 30,
    static: true,
    useMin: true
  });
   
  $(".games_list img")
  .on('load', function() { magicGrid.positionItems(); })
  .on('error', function() { console.log("erro ao carregar imagem"); });
  
  magicGrid.listen();
  
  window.onscroll = function() {myFunction()};

//Get the navbar
var navbar = document.querySelector(".navbar");

//Get the offset position of the navbar
var sticky = navbar.offsetTop;

//Add the sticky class to the navbar when you reach its scroll position. Remove "sticky" when you leave the scroll position
function myFunction() {
 if (window.pageYOffset >= sticky) {
   navbar.classList.add("sticky")
 } else {
   navbar.classList.remove("sticky");
 }
}
})();

