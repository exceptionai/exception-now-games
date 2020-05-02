
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
})();

