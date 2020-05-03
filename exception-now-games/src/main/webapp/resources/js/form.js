(() => {
	const btnRefresh = document.getElementById("btn-refresh-img");
	const inputRefresh = document.getElementById("imageUrl");
	const gameImg = $("#game-img");
	
	$(inputRefresh).on("blur", updatePreview);
	
	btnRefresh.onclick = updatePreview;

	gameImg.on("error", messageImgError);
	
	updatePreview();
	 
	
	function updatePreview(){
		if(!!inputRefresh.value){
			gameImg.attr("src",inputRefresh.value); 
			gameImg.attr("title","");
		}else{
			gameImg.attr("src","https://www.getdigital.eu/web/getdigital/gfx/products/__generated__resized/1100x1100/12586NSM_Block_Lampe_004.jpg");
			gameImg.attr("alt","Imagem do jogo");
			gameImg.attr("title","interrogacao");
		}
		
	}
	
	function messageImgError(){
		VanillaToasts.create({
			title: "Erro ao carregar imagem",
			text: "Endere&ccedil;o inv&aacute;lido",
			type: "error",
			icon: "https://image.flaticon.com/icons/svg/742/742753.svg",
			timeout: 10000
		});
		$(".vanillatoasts-toast").prepend('<div class="vanillatoasts-icon">')
	}
	
	const priceInput = $("#price");
	
	$("#freePrice").change((event)=>{
		priceInput.attr("readonly",event.target.checked);
		priceInput.val(0.00)
	});
	
	if(priceInput.val() !== null && priceInput.val() === "0.0"){
		$("#freePrice").attr("checked",true);
		priceInput.attr("readonly",true);
	}
	
	
})()