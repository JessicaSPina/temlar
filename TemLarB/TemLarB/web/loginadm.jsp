<!DOCTYPE html>
<!--[if IE 9]><html class="lt-ie10" lang="en" > <![endif]-->
<html class="no-js" lang="pt-br" >

    <head>
        <meta charset="ISO-8859-1"/>
        <!-- If you delete this meta tag World War Z will become a reality -->
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <title>Tem Lar</title>
        <!-- If you are using the CSS version, only link these 2 files, you may add app.css to use for your overrides if you like -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/normalize.css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/foundation.css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/foundation.min.css" type="text/css"/>

        <style type="text/css">

            .azul{

                background-color:  #4682B4;

            }

            .cinza{

                background-color:  #A9A9A9;

            }
            
            
            .azul{

                background-color:  #6495ED;

            }
            
            .yellow{

                background-color: yellow;

            }

            

            h4.right{
                font-family:  Trebuchet MS;
                font-size:  1.5em;
                color: #4682B4;

            }

            h6.left{
                font-family:  Trebuchet MS;

                color: #fff;

            }
            .diferente{
                color: #fff;

            }
            h6.textoFooter{
                font-family:  Trebuchet MS;

                color: white;


            }

            .img{
                background-image: url(img/azul.jpg);
                height: 550px;
                position: center;
            }

            .centro{
                align: center;

            }
            
            
            .imagem{
                background-image: url(img/footer.png);
                height: 550px;
                position: center;
            }

            .imagem2{
                background-image: url(img/footer2.png);
                background-repeat:no-repeat;
                
                position: center;
            }
            
             .imagemsmall{
                background-image: url(img/footer3.png);
               
                position: center;
            }
  .diferente{
                color: #fff;

            }
            h6.textoFooter{
                font-family:  Trebuchet MS;

                color: white;


            }
            ul.none {
	list-style-type: none;
	}




        </style>

     </head>
  
      <body>  
        
       <div class="expanded row" style=" max-width: 97% ">
           <div class="row" >
    <div class="small-12 medium-3 large-3 columns " > 
        <img src="img/logo.png"  width="250px"  height="20px" />

    </div>


    <div class="medium-2 columns">
        </br>
        <label>Onde ?
            <select id="select" required>

                <option value="volvo">Andradina</option>
                <option value="saab">Jales</option>
                <option value="mercedes">Santa Albertina</option>
                <option value="audi">Santa F� do Sul</option>
            </select>
        </label>
    </div>

    <div class="medium-2 columns">
        </br>
        <label>Qual Negocia��o ?
            <select id="select" required>

                <option value="volvo">Alugar</option>
                <option value="saab">Comprar</option>
                <option value="volvo">Temporada</option>

            </select>
        </label>
    </div>

    <div class="medium-2 columns">
        </br>

        <label>Qual Tipo?
            <select id="select" required>

                <option value="volvo">Apartamento</option>
                <option value="saab">Casa</option>
                <option value="volvo">C�modo</option>
                <option value="saab">Lotes</option>
                <option value="volvo">Rural</option>
                <option value="saab">Comercial</option>


            </select>
        </label>
    </div>

        </div>
       </div>
    
    <!--<h4 href="#" class="right"  > <strong>&nbsp; voc� busca esta aqui ! </strong>  </h4>
    <h4 href="#" class="right"  > <strong> O que  </strong> </h4>
    -->



    <!--<input type="text"  placeholder="Buscar.."> -->


    <!--<div class="small-6 medium-2 large-2 end columns show-for-medium-up"> 
    </br>
            <a href="#" type="search" class="button postfix">Buscar</a> 
    </div> 
            <div class="small-6 end columns show-for-small-only"> 
    
            <a href="#" type="search" class="button postfix">Buscar</a> 
    </div> 
    -->






    <!-- C�digo HTML aqui.... -->

    <!--declarando a navbar-->

    </br>
 <div class="expanded row" style=" max-width: 100% ">
           <div class="row" >
    <div class="small-12 medium-12 large-12  columns " > 
        <nav class="top-bar" data-topbar>
            <ul class="title-area">
                <li class="name">
                    <h1><a href="#"></a></h1>
                </li>
                <!--barra de navega��o para telas pequenas -->
                <li class="toggle-topbar menu-icon"><a href="#"><span>Menu</span></a></li>
            </ul>
            <section class="top-bar-section">
                <ul class="center"> 
                    <li><a href="index.jsp">P�gina Inicial</a></li>
                    <li><a href="sobre.jsp">Sobre</a></li>
                    <li class="has-dropdown"><a href="imoveisVenda.jsp">Im�veis a Venda</a>
                        <ul class="dropdown">
                            <li><a href="casasV.jsp">Casas</a></li>
                            <li><a href="#">Apartamentos</a></li>
                            <li><a href="#">Lotes</a></li>
                            <li><a href="#">Rurais</a></li>
                            <li><a href="#">Comerciais</a></li>


                        </ul>               
                    </li>
                    <li class="has-dropdown"><a href="imoveisAlugar.jsp">Im�veis a alugar</a>
                        <ul class="dropdown">
                            <li><a href="casasA.jsp">Casas</a></li>
                            <li><a href="#">Apartamentos</a></li>
                            <li><a href="#">C�modos</a></li>
                            <li><a href="#">Rurais</a></li>
                            <li><a href="#">Comerciais</a></li>

                        </ul>               
                    </li>
                    <li><a href="faleConosco.jsp"> Contato</a></li>

                </ul>
            </section>


        </nav> 
    </div></div></div>
 
    </br>
 <div class="expanded row" style=" max-width: 95% ">
           <div class="row" >
    <div class="small-12 medium-12 large-12 columns " > 
        </br>
        <ul class="breadcrumbs">
            <li><a href="index.jsp">P�gina</a></li>
<li class="unavailable"><a href="login.jsp">Login Administrador</a></li>
        </ul>
    </div>
           </div>
     
 </div>
    


    
    <div class="expanded row" style=" max-width: 93% ">
           <div class="row" >
    <div class="small-12 medium-12 large-12 columns azul img" > <!--para voltar a imagem de fundo � s� colocar img dentro da div -->

        </br></br></br></br></br>
        
        
     
        <div class="small-12 medium-6 large-4 large-left columns"> 
        


   <div class="panel callout radius">
   <form id="frmPost" center action="">
       <h5 style="color:white;" align="center"><strong> Administradores</strong></h5>
                <div class="small-12  medium-12 large-12  columns"> 
                    <h6 style="color:white;"><b> Login:</b></h6><input type="text" size="10" id="Text0" /><br />
                </div>
                <div class="small-12 medium-12 large-12  columns"> 
                <h6 style="color:white;"><b> Senha:</b></h6><input type="text"  id="Text1" />
                <a href="#" type="submit" class="button">Enviar</a>
                </div>
            </form>
</div>
            
    </div>
    </div>
           </div>
        
        
    </div>
</br> 
 
    
    
    
    
    
 
<div class="expanded row" style=" max-width:100%; margin-bottom: 0px; padding-bottom: 0px; ">
           <div class="row"  >
                 
        <footer >

            <div class="small-12 medium-12 large-12 columns imagem end columns show-for-large-up"  > 

                </br> </br> 
       
                <div class="medium-1 large-2 columns " > 
                   
                    </br>
                    </br>
                    
                </div>
                <div class="medium-3 large-2 columns " > 
                     
                    <h6 ><a href="index.jsp" class="diferente"><b> P�gina Inicial</b></a></h6>
                
                    <ul  class="none">
                        
                        <li  > <h6 ><a href="login.jsp" class="diferente"> Acesse sua Conta</a></h6></li>
                        
                        <li > <h6 style="color:white" >Cadastre-se</a></h6>
                            <ul type="disc" style="color:white"> 
                                <li><h6 ><a href="salvarpessoajuridica.jsp" class="diferente"> Cadastro Pessoa Jur�dica</a></h6></li>
                         <li><h6><a href="salvarpessoajuridica.jsp" class="diferente"> Cadastro Pessoa F�sica</a></h6></li>
                        
                        </ul>
                        <li><a href="planos.jsp" class="diferente"> Conhe�a Planos</li>
                        <li><a href="index.jsp" class="diferente">Tire D�vidas</li>
                        <li><a href="index.jsp" class="diferente">Quem Somos</li>
                    </ul>
                      </br></br>
                </div>



                <div class="medium-2 large-2 columns" > 
                    <h6 ><a href="imoveisVenda.jsp" class="diferente"><b> Im�veis a Venda</b></a></h6>
                    <ul  align="left" class="none">
                        <li> <h6 ><a href="#" class="diferente"> Casas</a></h6></li>
                       <li> <h6 ><a href="#" class="diferente"> Apartamentos</a></h6></li>
                        <li  > <h6 ><a href="#" class="diferente"> Lotes</a></h6></li>
                        <li  > <h6 ><a href="#" class="diferente"> Rurais</a></h6></li>
                        <li  > <h6 ><a href="#" class="diferente"> Comerciais</a></h6></li>
                    </ul>
                     </br></br>
                </div>

                <div class=" medium-2 large-2 columns" > 
                    <h6 ><a href="imoveisAlugar.jsp" class="diferente"><b>Im�veis a Alugar</b></a></h6>
                    <ul  align="left" class="none">
                        <li> <h6 ><a href="#" class="diferente"> Casas</a></h6></li>
                       <li> <h6 ><a href="#" class="diferente"> Apartamentos</a></h6></li>
                        <li  > <h6 ><a href="#" class="diferente"> C�modos</a></h6></li>
                        <li  > <h6 ><a href="#" class="diferente"> Rurais</a></h6></li>
                        <li  > <h6 ><a href="#" class="diferente"> Comerciais</a></h6></li>
                    </ul>
                     </br></br>
                </div>
                <div class="medium-1 large-2 columns " > 
                   
                    <img src="img/logo.png"/>
                </div>
                
               
                <center>
                    
                <hr style="width:80%; align:center;">
                </center>
                
                
                <h6 align="center"   class="textoFooter" >Tem Lar - Todos os direitos reservados. �2016 - Desenvolvido por Ana Paula e J�ssica Pina</h6>
       
            </div>

      
            


            <div class="small-12 medium-12 large-12 columns imagem end columns show-for-medium-only"  > 

                </br> </br> 
       
                <div class="medium-1 large-2 columns " > 
                   
                    </br>
                    </br>
                    
                </div>
                <div class="medium-3 large-2 columns " > 
                     
                    <h6 ><a href="index.jsp" class="diferente"><b> P�gina Inicial</b></a></h6>
                
                    <ul  class="none">
                        
                        <li  > <h6 ><a href="login.jsp" class="diferente"> Acesse sua Conta</a></h6></li>
                        
                        <li > <h6 style="color:white" >Cadastre-se</a></h6>
                            <ul type="disc" style="color:white"> 
                                <li><h6 ><a href="salvarpessoajuridica.jsp" class="diferente"> Cadastro Pessoa Jur�dica</a></h6></li>
                         <li><h6><a href="salvarpessoajuridica.jsp" class="diferente"> Cadastro Pessoa F�sica</a></h6></li>
                        
                        </ul>
                        <li><a href="planos.jsp" class="diferente"> Conhe�a Planos</li>
                        <li><a href="index.jsp" class="diferente">Tire D�vidas</li>
                        <li><a href="index.jsp" class="diferente">Quem Somos</li>
                    </ul>
                      </br></br>
                </div>



                <div class="medium-2 large-2 columns" > 
                    <h6 ><a href="imoveisVenda.jsp" class="diferente"><b> Im�veis a Venda</b></a></h6>
                    <ul  align="left" class="none">
                        <li> <h6 ><a href="#" class="diferente"> Casas</a></h6></li>
                       <li> <h6 ><a href="#" class="diferente"> Apartamentos</a></h6></li>
                        <li  > <h6 ><a href="#" class="diferente"> Lotes</a></h6></li>
                        <li  > <h6 ><a href="#" class="diferente"> Rurais</a></h6></li>
                        <li  > <h6 ><a href="#" class="diferente"> Comerciais</a></h6></li>
                    </ul>
                     </br></br>
                </div>

                <div class=" medium-2 large-2 columns" > 
                    <h6 ><a href="imoveisAlugar.jsp" class="diferente"><b>Im�veis a Alugar</b></a></h6>
                    <ul  align="left" class="none">
                        <li> <h6 ><a href="#" class="diferente"> Casas</a></h6></li>
                       <li> <h6 ><a href="#" class="diferente"> Apartamentos</a></h6></li>
                        <li  > <h6 ><a href="#" class="diferente"> C�modos</a></h6></li>
                        <li  > <h6 ><a href="#" class="diferente"> Rurais</a></h6></li>
                        <li  > <h6 ><a href="#" class="diferente"> Comerciais</a></h6></li>
                    </ul>
                     </br></br>
                </div>
               
                
               
                <center>
                    
                <hr style="width:80%; align:center;">
                </center>
                
                
                <h6 align="center"   class="textoFooter" >Tem Lar - Todos os direitos reservados. �2016 - Desenvolvido por Ana Paula e J�ssica Pina</h6>
       
            </div>
          

            
            
           <!--footer tela small --> 
            
               <div class="small-12 medium-12 large-12 columns imagemsmall end columns show-for-small-only "> 

            
               
             
                <h6 align="center"   class="textoFooter" >Tem Lar - Todos os direitos reservados. �2016 - Desenvolvido por Ana Paula e J�ssica Pina</h6>
       
               </div>

</footer>
                 </div>
           </div>






<!-- ************************************************ -->
<script src="js/vendor/jquery.js"></script>
<script src="js/foundation.min.js"></script>
<script>
    $(document).foundation();
</script>
</body>
</html>