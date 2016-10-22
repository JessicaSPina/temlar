<%@page import="br.com.temlar.modell.Pessoa"%>
<!DOCTYPE html>
<!--[if IE 9]><html class="lt-ie10" lang="en" > <![endif]-->

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>


<html class="no-js" lang="pt-br" >
    <head>
        <meta charset="ISO-8859-1"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>TEM LAR</title>

        <link rel="stylesheet" href="${pageContext.request.contextPath}/adm/css/foundation.css" />

        <!-- Custom styles for this template -->

        <link rel="stylesheet" href="${pageContext.request.contextPath}/adm/css/dashboard.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/adm/css/style.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/adm/css/dripicon.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/adm/css/typicons.css" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/adm/css/font-awesome.css" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/adm/css/theme.css">

        <!-- pace loader -->
        <script src="${pageContext.request.contextPath}/adm/js/pace/pace.js"></script>
        <link href="${pageContext.request.contextPath}/adm/js/pace/themes/orange/pace-theme-flash.css" rel="stylesheet" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/adm/js/slicknav/slicknav.css" />



        <script src="${pageContext.request.contextPath}/adm/js/vendor/modernizr.js"></script>

    </head>

    <body>
        <!-- preloader -->
        <div id="preloader">
            <div id="status">&nbsp;</div>
        </div>
        <!-- End of preloader -->

        <div class="off-canvas-wrap" data-offcanvas>
            <!-- right sidebar wrapper -->
            <div class="inner-wrap">


                <!-- Right sidemenu -->
                <div id="skin-select">
                    <!--      Toggle sidemenu icon button -->
                    <a id="toggle">
                        <span class="fa icon-menu"></span>
                    </a>
                    <!--      End of Toggle sidemenu icon button -->

                    <div class="skin-part">
                        <div id="tree-wrap">
                            <!-- Profile -->
                            <div class="profile">
                                <img alt="" class="" src="${pageContext.request.contextPath}/adm/img/logo.png">
                                <h3>TEM LAR</h3>

                            </div>
                            <!-- End of Profile -->

                            <!-- Menu sidebar begin-->
                            <div class="side-bar">
                                <ul id="menu-showhide" class="topnav slicknav">
                                    <li>
                                        <a id="menu-select" class="tooltip-tip" href="${pageContext.request.contextPath}/cliente/index.jsp" title="home">
                                            <i class="fontello-puzzle"></i>
                                            <span>Home</span>

                                        </a>

                                    </li>
                                    <li>
                                        <a class="tooltip-tip" href="#">
                                            <i class="fontello-lastfm"></i>
                                            <span>Cliente</span>

                                        </a>
                                        <ul>

                                            <li>
                                                <a href="${pageContext.request.contextPath}/ListarCliente">Listar Cliente</a>
                                            </li>

                                        </ul>
                                    </li>

                                    <li>
                                        <a class="tooltip-tip" href="#" title="Imovel">
                                            <i class="fontello-puzzle"></i>
                                            <span>Imóvel</span>

                                        </a>
                                        <ul>

                                            <li>
                                                <a class="tooltip-tip" href="#" title="Cadastrar Imóvel">
                                                    <i class="fontello-cw"></i>
                                                    <span>Cadastrar</span>

                                                </a>
                                                <ul> 



                                                    <a class="tooltip-tip" href="${pageContext.request.contextPath}/cliente/salvarcasa.jsp" title="Cadastro Casa Urbana\Rural">
                                                        <i class="fontello-cw"></i>
                                                        <span>Casa</span>

                                                    </a>

                                                    <a class="tooltip-tip" href="${pageContext.request.contextPath}/cliente/salvarcomercial.jsp" title="Salvar Comercio">
                                                        <i class="fontello-cw"></i>
                                                        <span>Comercial</span>

                                                    </a>

                                                    <a class="tooltip-tip" href="${pageContext.request.contextPath}/cliente/salvarlote.jsp" title="Salvar Lote" title="Cadastrar">
                                                        <i class="fontello-cw"></i>
                                                        <span>Lote</span>

                                                    </a>


                                                </ul>
                                            </li>


                                            <li>

                                                <a class="tooltip-tip" href="#" title="Listar Imóvel">
                                                    <i class="fontello-pin-outline"></i>
                                                    <span>Listar</span>

                                                </a>
                                                <ul> 



                                                    <a class="tooltip-tip" href="${pageContext.request.contextPath}/ListarCasa" title="Listar Casa Urbana/Rural">
                                                        <i class="fontello-cw"></i>
                                                        <span>Casa</span>

                                                    </a>

                                                    <a class="tooltip-tip" href="${pageContext.request.contextPath}/ListarComercial" title="Listar Comercio"  >
                                                        <i class="fontello-cw"></i>
                                                        <span>Comercial</span>

                                                    </a>

                                                    <a class="tooltip-tip" href="${pageContext.request.contextPath}/ListarLote" title="Listar Lote" >
                                                        <i class="fontello-cw"></i>
                                                        <span>Lote</span>

                                                    </a>



                                                </ul>  



                                            </li>
                                        </ul>




                                    </li>



                                    <li>
                                        <a class="tooltip-tip" href="#" title="Quarto">
                                            <i class="fontello-puzzle"></i>
                                            <span>Quarto</span>

                                        </a>
                                        <ul>
                                            <li>
                                                <a href="${pageContext.request.contextPath}/cliente/salvarquarto.jsp" title="SalvarQuarto">Cadastrar

                                                </a>
                                            </li>
                                            <li>

                                                <a href="${pageContext.request.contextPath}/Listarquarto" title="ListarQuarto">Listar</a>
                                            </li>
                                        </ul>
                                    </li>



                                    <li>
                                        <a href="relatorio.jsp">
                                            <i class="fontello-chart-alt-outline"></i>
                                            <span>Relatórios&nbsp;  </span>
                                        </a>
                                        <ul>
                                            <li>
                                                <a href="form-element.html" title="Form Elements">Form Elements</a>
                                            </li>
                                            <li>
                                                <a href="andvance-form.html" title="Andvance Form">Andvance Form</a>
                                            </li>
                                            <li>
                                                <a href="text-editor.html" title="Text Editor">Text Editor</a>
                                            </li>
                                            <li>
                                                <a href="file-upload.html" title="File Upload">File Upload</a>
                                            </li>
                                        </ul>
                                    </li>




                                </ul>
                            </div>
                            <!-- end of Menu sidebar  -->

                        </div>
                    </div>
                </div>
                <!-- end of Rightsidemenu -->



                <div class="wrap-fluid" id="paper-bg">
                    <!-- top nav -->
                    <div class="top-bar-nest">
                        <nav class="top-bar" data-topbar role="navigation" data-options="is_hover: false">
                            <ul class="title-area left">


                                <!-- Remove the class "menu-icon" to get rid of menu icon. Take out "Menu" to just have icon alone -->
                                <li class="toggle-topbar menu-icon"><a href="#"><span></span></a>
                                </li>
                            </ul>

                            <section class="top-bar-section ">
                                <!-- Right Nav Section -->
                                <ul class="left">
                                    <li class="has-dropdown bg-white">
                                        <a class="bg-white" href="#"><i class="text-green fa fa-envelope"></i>&nbsp;<span class="label edumix-msg-noft">84</span></a>
                                        <ul class="dropdown dropdown-nest">
                                            <li class="top-dropdown-nest"><span class="label round bg-green">MESSAGE</span>
                                            </li>
                                            <li class="bg-blue">
                                                <a href="#">
                                                    <h3 class=" text-black"> Big Boss<b class="text-red fontello-record" ></b><span>Just Now<small></small></span>
                                                    </h3>
                                                    <p class=" text-black">Important task!</p>
                                                </a>
                                            </li>


                                            <li>
                                                <div class="slim-scroll">

                                                    <div>
                                                        <a href="#">
                                                            <h3>Noel A. Riley<b class="text-green fontello-record" ></b><span>12:23<small>PM</small></span>
                                                            </h3>
                                                            <p>Dua dua sayang adik kakak</p>
                                                        </a>
                                                    </div>
                                                    <div>
                                                        <a href="#">
                                                            <h3>Shirley J. Carneal<b class="text-gray fontello-record" ></b><span>10:11<small>PM</small></span>
                                                            </h3>
                                                            <p>Tiga tiga sayang kekasihku</p>
                                                        </a>
                                                    </div>
                                                    <div>
                                                        <a href="#">
                                                            <h3>Paul L. Williamsr<b class="text-gray fontello-record" ></b><span>Yesterday</span>
                                                            </h3>
                                                            <p>Empat empat sayang semuanya</p>
                                                        </a>
                                                    </div>
                                                    <div>
                                                        <a href="#">
                                                            <h3>William L. Wilcox<b class="text-gray fontello-record" ></b><span>2 Days Ago</span>
                                                            </h3>
                                                            <p>Yang jomblo kasian deh lu</p>
                                                        </a>
                                                    </div>
                                                </div>
                                            </li>

                                            <li class="active right">
                                                <a href="#">
                                                    <div class="label bg-white">View All</div>
                                                </a>
                                            </li>
                                        </ul>
                                    </li>
                                    <li class="has-dropdown bg-white">
                                        <a class="bg-white" href="#"><i class="text-blue fa fa-bell" ></i> <span class="label edumix-noft">45</span></a>
                                        <ul class="dropdown dropdown-nest">
                                            <li class="top-dropdown-nest"><span class="label round bg-blue">ALERT</span>
                                            </li>
                                            <li class="bg-black text-black">
                                                <i class="icon-warning"></i>
                                                <a href="#">
                                                    <h3 class="text-black">Sticky Very Important<span class="text-red fontello-record" ></span></h3>
                                                    <p class="text-black">1 minute ago</p>
                                                </a>
                                            </li>
                                            <li>
                                                <div class="slim-scroll">
                                                    <div>
                                                        <i class="fontello-megaphone"></i>
                                                        <a href="#">
                                                            <h3>Announcements <span class="text-green fontello-record" ></span>
                                                            </h3>
                                                            <p>Just Now !</p>
                                                        </a>
                                                    </div>
                                                    <div>
                                                        <i class="  fontello-attach-1"></i>
                                                        <a href="#">
                                                            <h3>Complete your profile<span class="text-yellow fontello-record" ></span>
                                                            </h3>
                                                            <p>2 Minute Ago</p>
                                                        </a>
                                                    </div>
                                                    <div>
                                                        <i class="  fontello-calendar-1"></i>
                                                        <a href="#">
                                                            <h3>New Schedule Realease<span class="text-yellow fontello-record" ></span>
                                                            </h3>
                                                            <p>30 Minute ago</p>
                                                        </a>
                                                    </div>
                                                    <div>
                                                        <i class="fontello-database-1"></i>
                                                        <a href="#">
                                                            <h3>New Student Data<span class="text-orange fontello-record" ></span>
                                                            </h3>
                                                            <p>1 Hour ago</p>
                                                        </a>
                                                    </div>
                                                    <div>
                                                        <i class="fontello-graduation-cap"></i>
                                                        <a href="#">
                                                            <h3>Graduate Student List<span class="fontello-record" ></span>
                                                            </h3>
                                                            <p>2 Days ago</p>
                                                        </a>
                                                    </div>
                                                </div>
                                            </li>
                                            <li class="active right">
                                                <a href="#">
                                                    <div class="label bg-white">View All</div>
                                                </a>
                                            </li>
                                        </ul>
                                    </li>
                                </ul>
                                <!-- Left Nav Section -->
                                <ul class="left">

                                    <!-- Search | has-form wrapper -->
                                    <li class="has-form bg-white">
                                        <div class="row collapse">

                                            <div class="large-12 columns">
                                                <div class="dark"> </div>
                                                <input class="input-top" type="text" placeholder="search">
                                            </div>
                                        </div>
                                    </li>
                                </ul>

                                <ul class="right">
                                    <li class=" has-dropdown bg-white">
                                        <a class="bg-white" href="#"><img alt="" class="admin-pic img-circle" src="#"><span class="admin-pic-text text-gray"><</span>
                                        </a>




                                        <ul class="dropdown dropdown-nest profile-dropdown">

                                            <li>
                                                <i class="icon-user"></i>
                                                <a href="#">
                                                    <h4>Perfil<span class="text-aqua fontello-record" ></span></h4>
                                                </a>
                                            </li>

                                            <li>
                                                <i class="icon-upload"></i>
                                                <a href="login.html">
                                                    <h4>Sair <span class="text-aqua fontello-flow-split" ></span></h4>
                                                </a>
                                            </li>

                                            <!--   <li class="active right">
                                                   <a href="#">
                                                       <div class="label bg-white">More</div>
                                                   </a>
                                               </li>-->
                                        </ul>
                                    </li>
                                    <li class="bg-white">
                                        <a class="right-off-canvas-toggle bg-white text-gray" href="#"><span style="font-size:13px" class="icon-view-list" ></span></a>
                                    </li>
                                </ul>
                            </section>
                        </nav>
                    </div>


                    <ul class="breadcrumbs">
                        <li><a href="#"><span class="entypo-home"></span></a>
                        </li>
                        <li>Página Inicial

                        <li>Cadastrar de Casa (Rural e Urbana)
                        </li>
                        <!--   <ul class="right inline-list">
                            <li>Help Center</a>
                            </li>
                            <li>Mail Support
                            </li>
                        </ul> -->
                    </ul>


                    <h2> ${sucesso}</h2>
                    <form data-abide name="salvar" action="<%=request.getContextPath()%>/SalvarCasa" method="POST">
                        <h5> Cadastro Casa (Rural e Urbana)</h5> 

                        <div class="id-field">
                            <input type="hidden" name="idpessoa" value="<%=request.getSession().getAttribute("idpessoa")%>" readonly="readonly" /></br></br>

                            <input type="hidden" name="idcasa" value="${casa.idcasa}" readonly="readonly" /> </br></br>

                        </div>






                        <div class="row">
                            <div class="large-9  columns">


                                <div class="small-12 medium-4 large-4 columns" >
                                    <div class="tipoimovel-field">

                                        <label>Tipo Casa <small>required</small>
                                            <select name="tipocasa"> 


                                                <option name="urbano" value="urbano"  value="${casa.tipoCasa}" id="urbano">Urbano</option>
                                                <option name="rural" value="rural" value="${casa.tipoCasa}" id="rural">Rural</option>
                                                <option name="apartamento" value="apartamento" value="${casa.tipoCasa}" id="apartamento">Apartamento</option>
                                            </select>
                                        </label>
                                    </div>
                                </div> 



                                <div class="small-12 medium-4 large-4 columns" >

                                    <div class="numquartoscasas-field">
                                        <label>Numero de Quartos<small>required</small>
                                            <input type="number" name="numquarto" id="numquarto" value="" required   />


                                        </label>
                                        <small class="error">Digite o Numero de Quartos</small>
                                    </div>
                                </div> 


                                <div class="small-12 medium-4 large-4 columns" >

                                    <div class="numbanheiroscasas-field">
                                        <label>Banheiros<small>required</small>
                                            <input type="number" name="numbanheiro" id="numbanheiro" value="" required/>


                                        </label>
                                        <small class="error">Digite o Numero de Banheiros</small>
                                    </div>
                                </div> 
                            </div>
                        </div>


                        <div class="row">
                            <div  class="large-9 columns">

                                <div class="small-12 medium-4 large-4 columns" >

                                    <div class="numsalascasas-field">
                                        <label>Quantidade de Salas<small>required</small>
                                            <input type="number" name="numsalas" id="numsalas" value="" required   />


                                        </label>
                                        <small class="error">Digite o Numero de Banheiros</small>
                                    </div>
                                </div> 




                                <div class="small-12 medium-4 large-4 columns" >

                                    <div class="numcozinhascasas-field">
                                        <label>Numero de Cozinhas<small>required</small>
                                            <input type="number" name="numcozinhas" id="numcozinhas" value="" required   />


                                        </label>
                                        <small class="error">Digite a Quantidade de Cozinhas</small>
                                    </div>
                                </div> 





                                <div class="small-12 medium-4 large-4 columns" >

                                    <div class="quantidadeVagasGaragemcasas-field">
                                        <label>Vagas na Garagem<small>required</small>
                                            <input type="number" name="qntvaggaragem" id="qntvaggaragem" value="" required   />


                                        </label>
                                        <small class="error">Digite a Quantidade de vagas</small>
                                    </div>
                                </div> 


                            </div>
                        </div>

                        <div class="row">
                            <div  class="large-9 columns">


                                <div class="small-12 medium-4 large-4 columns" >

                                    <div class="tipoquintalterreo-field">
                                        <label>Tipo Quintal<small>required</small>

                                            <select name="tipoquintal"> 


                                                <option name="terra" value="terra"  value="${casa.tipoQuintal}" id="terra">Terra</option>
                                                <option name="cimento" value="cimento" value="${casa.tipoQuintal}" id="cimento">Concreto</option>


                                                <option name="outro" value="outro" value="${casa.tipoQuintal}" id="outro">Outros</option>

                                            </select>
                                        </label>
                                    </div>
                                </div>



                                <div class="small-12 medium-4 large-4 columns" >

                                    <div class="tipoTelhadoterreo-field">
                                        <label>Tipo Telhado <small>required</small>

                                            <select name="tipotelhado"> 


                                                <option name="laje" value="laje"  value="${casa.tipoTelhado}" id="laje">Laje</option>
                                                <option name="pvc" value="pvc" value="${casa.tipoTelhado}" id="pvc">PVC</option>
                                                <option name="romana" value="romana" value="${casa.tipoTelhado}" id="romana">Romana</option>
                                                <option name="francesa" value="francesa" value="${casa.tipoTelhado}" id="francesa">Francesa</option>
                                                <option name="outro" value="outro" value="${casa.tipoTelhado}" id="outro">Outros</option>

                                            </select>
                                        </label>
                                    </div>
                                </div>                   






                                <div class="small-12 medium-4 large-4 columns" >

                                    <div class="situacaoPinturacasas-field">
                                        <label>Situação Pintura<small>required</small>

                                            <select name="situacaopintura"> 


                                                <option name="nova" value="nova"  value="${casa.situacaoPintura}" id="nova">Nova</option>
                                                <option name="usada" value="usada" value="${casa.situacaoPintura}" id="usada">Usada</option>
                                                <option name="desgastada" value="desgastada" value="${casa.situacaoPintura}" id="desgastada">Desgastada</option>

                                                <option name="outro" value="outro" value="${casa.situacaoPintura}" id="outro">Outros</option>

                                            </select>
                                        </label>
                                    </div>
                                </div>
                            </div>
                        </div>


                        <div class="row">
                            <div  class="large-9 columns">

                                <div class="small-12 medium-4 large-4 columns" >
                                    <div class="despejo-field">
                                        <label>Possui Despejo ? <small>required</small>
                                            </br>
                                            <input type="radio" name="possuidespejo" value="sim" id="sim" ${casa.possuidespejo == 'sim' ? 'checked' : ''} >
                                            <label for="sim">Sim</label>
                                            <input type="radio" name="possuidespejo" value="nao" id="nao" ${casa.possuidespejo == 'nao' ? 'checked' : ''}>
                                            <label for="nao">Não</label>
                                        </label>
                                    </div> 

                                </div> 





                                <div class="small-12 medium-4 large-4 columns" >
                                    <div class="arealazer-field">
                                        <label>Area de Lazer<small>required</small>
                                            </br>
                                            <input type="radio" name="arealazer" value="sim" id="sim" ${casa.arealazer == 'sim' ? 'checked' : ''} >
                                            <label for="sim">Sim</label>
                                            <input type="radio" name="arealazer" value="nao" id="nao" ${casa.arealazer == 'nao' ? 'checked' : ''}>
                                            <label for="nao">Não</label>
                                        </label>
                                    </div> 

                                </div> 


                                <div class="small-12 medium-4 large-4 columns" >
                                    <div class="areaservico-field">
                                        <label>Area de Serviço ? <small>required</small>
                                            </br>
                                            <input type="radio" name="areaservico" value="sim" id="sim" ${casa.areaservico == 'sim' ? 'checked' : ''} >
                                            <label for="sim">Sim</label>
                                            <input type="radio" name="areaservico" value="nao" id="nao" ${casa.areaservico == 'nao' ? 'checked' : ''}>
                                            <label for="nao">Não</label>
                                        </label>
                                    </div> 

                                </div>

                            </div>
                        </div>


                        <div class="row">
                            <div  class="large-9 columns">


                                <div class="small-12 medium-4 large-4 columns" >

                                    <div class="tipoPiso-field">
                                        <label>Tipo Piso <small>required</small>

                                            <select name="tipopiso"> 


                                                <option name="ceramica" value="ceramica"  value="${casa.tipoPiso}" id="ceramica">Cerâmica</option>
                                                <option name="porcelana" value="porcelana" value="${casa.tipoPiso}" id="porcelana">Porcelana</option>
                                                <option name="granito" value="granito" value="${casa.tipoPiso}" id="granito">Granito</option>

                                                <option name="outro" value="outro" value="${casa.tipoPiso}" id="outro">Outros</option>

                                            </select>
                                        </label>
                                    </div>
                                </div> 



                                <div class="small-12 medium-4 large-4 columns" >

                                    <div class="quantidadeSuites-field">
                                        <label>Quantidade de Suites<small>required</small>
                                            <input type="number" name="numsuite" id="numsuite" value="" required   />


                                        </label>
                                        <small class="error">Digite a Quantidade de Suites</small>
                                    </div>
                                </div>    





                                <div class="small-12 medium-4 large-4 columns" >


                                    <div class="andar-field">
                                        <label>Andar<small>required</small>
                                            <input type="number" name="andar" id="andar" value="" required   />


                                        </label>
                                        <small class="error">Digite o Valor</small>
                                    </div>
                                </div> 

                            </div>
                        </div>



                        <div class="row">
                            <div  class="large-9 columns">



                                <div class="small-12 medium-4 large-4 columns" >


                                    <div class="valorimovel-field">
                                        <label>Valor<small>required</small>
                                            <input type="number" name="valorimovel" id="valorimovel" value="" required   />


                                        </label>
                                        <small class="error">Digite o Valor</small>
                                    </div>
                                </div> 



                                <div class="small-12 medium-4 large-4 columns" >
                                    <div class="mobiliacasas-field">
                                        <label>Tem Movéis ? <small>required</small>
                                            </br>
                                            <input type="radio" name="mobilia" value="sim" id="sim" ${casa.mobiliaSim == 'sim' ? 'checked' : ''} >
                                            <label for="sim">Sim</label>
                                            <input type="radio" name="mobilia" value="nao" id="nao" ${casa.mobiliaNao == 'nao' ? 'checked' : ''}>
                                            <label for="nao">Não</label>
                                        </label>
                                    </div> 

                                </div>     

                                <div class="small-12 medium-4 large-4 columns" >
                                    <div class="tipoanuncio-field">

                                        <label>Tipo Anúnuncio <small>required</small>
                                            <select name="tipoanuncio"> 


                                                <option name="venda" value="venda"  value="${imovel.tipoAnuncio}" id="venda">Venda</option>
                                                <option name="locacao" value="locacao" value="${imovel.tipoAnuncio}" id="locacao">Locação</option>

                                            </select>
                                        </label>
                                    </div>
                                </div>


                            </div>
                        </div>



                        <div class="row">
                            <div  class="large-9 columns">



                                <div class="small-12 medium-4 large-4 columns" >				
                                    <div class="cepimovel-field">

                                        <label>CEP <small>required</small>
                                            <input name="cepimovel" type="text" id="cepimovel" value="" size="10" maxlength="9" pattern= "\d{5}-?\d{3}" required/>

                                        </label>
                                        <small class="error">Digite o CEP</small>
                                    </div>

                                </div>	


                                <div class="small-12 medium-4 large-4 columns" >	

                                    <a name="buscarCepJson"    onclick="BuscarCEP('json');">  <img src="${pageContext.request.contextPath}/img/lupa.png"/> </a>

                                </div>



                                <div class="small-12 medium-4 large-4 columns" >
                                    <div class="bairroimovel-field">
                                        <label>Bairro <small>required</small>
                                            <input type="text" name="bairroimovel" id="bairroimovel" value="" required   />

                                        </label>
                                        <small class="error">Digite o Bairro</small>
                                    </div>


                                </div>


                            </div></div>




                        <div class="row">
                            <div  class="large-9 columns">



                                <div class="small-12 medium-6 large-6 columns" >

                                    <div class="ruaimovel-field">
                                        <label>Rua<small>required</small>
                                            <input type="text" name="endimovel" id="endimovel" value="" required   />


                                        </label>
                                        <small class="error">Digite o Endereço</small>
                                    </div>
                                </div>


                                <div class="small-12 medium-4 large-4 columns" >	
                                    <div class="cidadeimovel-field">
                                        <label>Cidade <small>required</small>
                                            <input name="cidadeimovel" type="text" id="cidadeimovel" size="40"  required/></label>

                                        <small class="error">Digite a Cidade</small>
                                    </div>
                                </div>

                                <div class="small-12 medium-2 large-2 columns" >	

                                    <div class="ufimovel-field">
                                        <label>UF <small>required</small>
                                            <input name="ufimovel" type="text" id="ufimovel" size="2" required/>
                                        </label>
                                    </div>
                                </div>

                            </div>
                        </div>



                        <div class="row">
                            <div  class="large-9 columns">



                                <div class="small-12 medium-4 large-4 columns" >
                                    <div class="numimovel-field">
                                        <label>Número <small>required</small>
                                            <input type="number" name="numimovel" id="numimovel" value="" required   />

                                        </label>
                                        <small class="error">Digite o Número</small>
                                    </div>
                                </div>

                                <div class="small-12 medium-4 large-4 columns" >
                                    <div class="areaimovel-field">
                                        <label>Area m²<small>required</small>
                                            <input type="number" name="areaimovel" id="areaimovel" value="" required   />

                                        </label>
                                        <small class="error">Digite a Área m²</small>
                                    </div>


                                </div> 

                            </div>
                        </div>



                        <div class="row">
                            <div  class="large-9 columns">



                                <div class="small-12 medium-4 large-4 columns" >
                                    <div class="descricaoimovel-field">
                                        <label>Descricao<small>required</small>
                                            <input type="text" name="descricaoimovel" id="descricaoimovel" value="" required   />

                                        </label>
                                        <small class="error">Digite a descricão</small>
                                    </div>


                                </div> 



                                <div class="small-12 medium-4 large-4 columns" >
                                    <div class="metragem-field">
                                        <label>Metragem<small>required</small>
                                            <input type="text" name="metragemimovel" id="metragemimovel" value="" required  placeholder="Exemplo 10 X 20" />

                                        </label>
                                        <small class="error">Digite a metragem </small>
                                    </div>


                                </div> 






                                <div class="idimovel-field">

                                    <input type="hidden" name="idimovel" value="${imovel.idimovel}" readonly="readonly" /> </br></br>

                                </div>



                            </div>
                        </div>

                        <div class="small-12 medium-9 large-9 columns" >




                            <button type="submit" class="tiny" value="Salvar" name="cadastrar">Enviar</button>

                            <button type="submit" class="tiny" value="Salvar" name="limpar">Limpar</button>
                    </form>






                    <!-- Container Begin -->
                </div> 
            </div>
            <!-- close the off-canvas menu -->
            <a class="exit-off-canvas"></a>
            <!-- End of Right Menu -->
        </div>
        <!-- end paper bg -->



        <script  type='text/javascript' src="${pageContext.request.contextPath}/adm/js/jquery.js" ></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/adm/js/waypoints.min.js"></script>
        <script type='text/javascript' src='${pageContext.request.contextPath}/adm/js/preloader-script.js'></script>
        <!-- foundation javascript -->
        <script type='text/javascript' src="${pageContext.request.contextPath}/adm/js/foundation.min.js"></script>
        <script type='text/javascript' src="${pageContext.request.contextPath}/adm/js/foundation.js"></script>
        <!-- main edumix javascript -->
        <script type='text/javascript' src='${pageContext.request.contextPath}/adm/js/slimscroll/jquery.slimscroll.js'></script>
        <script type='text/javascript' src='${pageContext.request.contextPath}/adm/js/slicknav/jquery.slicknav.js'></script>
        <script type='text/javascript' src='${pageContext.request.contextPath}/adm/js/sliding-menu.js'></script>
        <script type='text/javascript' src='${pageContext.request.contextPath}/adm/js/scriptbreaker-multiple-accordion-1.js'></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/adm/js/number/jquery.counterup.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/adm/js/circle-progress/jquery.circliful.js"></script>
        <script type='text/javascript' src='${pageContext.request.contextPath}/adm/js/app.js'></script>
        <!-- additional javascript -->
        <script type='text/javascript' src="${pageContext.request.contextPath}/adm/js/number-progress-bar/jquery.velocity.min.js"></script>
        <script type='text/javascript' src="${pageContext.request.contextPath}/adm/js/number-progress-bar/number-pb.js"></script>
        <script type='text/javascript' src="${pageContext.request.contextPath}/adm/js/loader/loader.js"></script>
        <script type='text/javascript' src="${pageContext.request.contextPath}/adm/js/loader/demo.js"></script>
        <!-- FLOT CHARTS -->
        <script src="${pageContext.request.contextPath}/adm/js/flot/jquery.flot.js" type="text/javascript"></script>
        <!-- FLOT RESIZE PLUGIN - allows the chart to redraw when the window is resized -->
        <script src="${pageContext.request.contextPath}/adm/js/flot/jquery.flot.resize.min.js" type="text/javascript"></script>
        <!-- FLOT PIE PLUGIN - also used to draw donut charts -->
        <script src="${pageContext.request.contextPath}/adm/js/flot/jquery.flot.pie.min.js" type="text/javascript"></script>
        <!-- FLOT CATEGORIES PLUGIN - Used to draw bar charts -->
        <script src="${pageContext.request.contextPath}/adm/js/flot/jquery.flot.categories.min.js" type="text/javascript"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/adm/js/skycons/skycons.js"></script>
        <script type='text/javascript' src="${pageContext.request.contextPath}/adm/js/jquery-3.1.0.js" ></script>


        <script>
                                        $(document).foundation();
        </script>




        <script type='text/javascript'>
            $.noConflict(true);


            function BuscarCEP(tipo) {
                //Nova variável "cep" somente com dígitos.

                var cep = $('#cepimovel').val().replace(/\D/g, '');

                //Verifica se o campo cep possui valor informado
                if (cep != "") {
                    //Expressão regular para validar o cep.
                    var validacep = /^[0-9]{8}$/;

                    //valida o formato do cep
                    if (validacep.test(cep)) {
                        if (tipo == 'json')
                            BuscarCepJSON(cep);
                        else
                            BuscarCepXML(cep);
                    }
                }
            }

            function limpa_formulário_cep() {
                //limpa valores do formulário de cep
                $("#endimovel").val("");

                $("#cepimovel").val("");
                $("#endimovel").val("");
                $("#bairroimovel").val("");
                $("#cidadeimovel").val("");
                $("#ufimovel").val("");
            }

            function BuscarCepJSON(cep) {
                //preencher os campos com ... enquanto consulta web service.
                $("#endimovel").val("...");

                $("#bairroimovel").val("...");
                $("#cidadeimovel").val("...");
                $("#ufimovel").val("...");

                $.getJSON({
                    url: "https://viacep.com.br/ws" + cep + "/json/",
                    context: document.body,
                    type: "GET",
                    success: function (dados) {
                        if (!("erro" in dados)) {
                            //atualiza os campos com os valores da consulta.
                            $("#endimovel").val(dados.logradouro);

                            $("#bairroimovel").val(dados.bairro);
                            $("#cidadeimovel").val(dados.localidade);
                            $("#ufimovel").val(dados.uf);
                        }//end if.
                        else {
                            //CEP pesquisado não foi encontrado
                            limpa_formulário_cep();
                            alert("CEP não encontrado.");
                        }
                    },
                    error: function (xhr, textStatus, error) {
                        console.log(xhr.responseText);
                        console.log(textStatus);
                        console.log(error);
                    }
                });
            }
            ;

            function BuscarCepXML(cep) {

                //preencher os campos com "..." enquanto consulta webservice.
                $("#endimovel").val("...");

                $("#bairroimovel").val("...");
                $("#cidadeimovel").val("...");
                $("#ufimovel").val("...");

                $.getJSON({
                    url: "https://viacep.com.br/ws/" + cep + "/xml/",
                    context: document.body,
                    type: "GET",
                    dataType: "xml",
                    success: function (dadosxml) {
                        if (!($(dadosxml).find('erro').text())) {
                            //atualizaos campos com os valores da consulta
                            $("#endimovel").val($(dadosxml).find('logradouro').text());

                            $("#bairroimovel").val($(dadosxml).find('bairro').text());
                            $("#cidadeimovel").val($(dadosxml).find('localidade').text());
                            $("#ufimovel").val($(dadosxml).find('uf').text());
                        }//end if
                        else {//CEP pesquisado não foi encontrado
                            limpa_formulário_cep();
                            alert("CEP não encontrado.");
                        }
                    },
                    error: function (xhr, textStatus, error) {
                        console.log(xhr.responseText);
                        console.log(textStatus);
                        console.log(error);
                    }
                });
            }
            ;
        </script>

        <script>
            $(document).foundation();
        </script>



    </body>

</html>
