
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
                                    <a id="menu-select" class="tooltip-tip" href="${pageContext.request.contextPath}/adm/index.jsp" title="home">
                                        <i class="fontello-puzzle"></i>
                                        <span>Home</span>

                                    </a>

                                </li>
                                <li>
                                    <a class="tooltip-tip" href="#">
                                        <i class="fontello-lastfm"></i>
                                        <span>Administrador</span>

                                    </a>
                                    <ul>
                                        <li>
                                            <a href="${pageContext.request.contextPath}/adm/salvaradministrador.jsp">Cadastrar</a>
                                        </li>  
                                        <li>
                                            <a href="${pageContext.request.contextPath}/ListarAdministrador">Listar</a>
                                        </li>
                        
                                    </ul>
                                </li>

                                <li>
                                    <a class="tooltip-tip" href="#" title="plano">
                                        <i class="fontello-check"></i>
                                        <span>Plano</span>

                                    </a>
                                    <ul>
                                        <li>
                                            <a href="${pageContext.request.contextPath}/adm/salvarplano.jsp" title="Inbox">Cadastrar
                                                 
                                            </a>
                                        </li>
                                        <li>

                                            <a href="${pageContext.request.contextPath}/ListarPlano" title="ListarPlano">Listar</a>
                                        </li>
                                    </ul>
                                </li>
                                  <li>
                                    <a class="tooltip-tip" href="#" title="PessoaFisica">
                                        <i class="fontello-lastfm"></i>
                                        <span>Pessoa Física</span>

                                    </a>
                                    <ul>
                                        <li>
                                            <a href="${pageContext.request.contextPath}/adm/salvarpessoafisica.jsp" title="Inbox">Cadastrar
                                                 
                                            </a>
                                        </li>
                                        <li>

                                            <a href="${pageContext.request.contextPath}/adm/listarpessoafisica.jsp" title="ListarPessoaFisica">Listar</a>
                                        </li>
                                    </ul>
                                </li>

                                <li>
                                    <a class="tooltip-tip" href="#" title="PessoaJurica">
                                        <i class="fontello-lastfm"></i>
                                        <span>Pessoa Jurídica</span>

                                    </a>
                                    <ul>
                                        <li>
                                            <a href="${pageContext.request.contextPath}/adm/salvarpessoajuridica.jsp" title="Inbox">Cadastrar
                                                 
                                            </a>
                                        </li>
                                        <li>

                                            <a href="${pageContext.request.contextPath}/ListarPessoaJuridica" title="ListarPlano">Listar</a>
                                        </li>
                                    </ul>
                                </li>
                                <li>
                                    <a class="tooltip-tip" href="#" title="PessoaJurica">
                                        <i class="fontello-check"></i>
                                        <span>Plano</span>

                                    </a>
                                    <ul>
                                        <li>
                                            <a href="${pageContext.request.contextPath}/adm/salvarplano.jsp" title="Inbox">Cadastrar
                                                 
                                            </a>
                                        </li>
                                        <li>

                                            <a href="${pageContext.request.contextPath}/ListarPlano" title="ListarPlano">Listar</a>
                                        </li>
                                    </ul>
                                </li>
                                <li>
                                    <a class="tooltip-tip" href="#" title="plano">
                                        <i class="fontello-puzzle"></i>
                                        <span>Tipo Imóvel</span>

                                    </a>
                                    <ul>
                                        <li>
                                            <a href="${pageContext.request.contextPath}/adm/salvartipoimovel.jsp" title="Inbox">Cadastrar
                                                 
                                            </a>
                                        </li>
                                        <li>

                                            <a href="${pageContext.request.contextPath}/ListarTipoImovel" title="ListarTipoImovel">Listar</a>
                                        </li>
                                    </ul>
                                </li>
                                  <li>
                                    <a class="tooltip-tip" href="#" title="uf">
                                        <i class="fontello-certificate"></i>
                                        <span>Cidade</span>

                                    </a>
                                    <ul>
                                        <li>
                                            <a href="${pageContext.request.contextPath}/adm/salvarcidade.jsp" title="CadastrarCidade">Cadastrar
                                                 
                                            </a>
                                        </li>
                                        <li>

                                            <a href="${pageContext.request.contextPath}/ListarCidade" title="listarCidade">Listar</a>
                                        </li>
                                    </ul>
                                </li>
                              <li>
                                    <a class="tooltip-tip" href="#" title="uf">
                                       <i class="fontello-direction"></i>
                                        <span>UF</span>

                                    </a>
                                    <ul>
                                        <li>
                                            <a href="${pageContext.request.contextPath}/adm/salvaruf.jsp" title="Inbox">Cadastrar
                                                 
                                            </a>
                                        </li>
                                        <li>

                                            <a href="${pageContext.request.contextPath}/ListarUf" title="listarUF">Listar</a>
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
                                    <a class="bg-white" href="#"><img alt="" class="admin-pic img-circle" src="http://api.randomuser.me/portraits/thumb/men/28.jpg"><span class="admin-pic-text text-gray">Oi, Meninas </span>
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
                <!-- end of top nav -->

                <!-- breadcrumbs -->
                <ul class="breadcrumbs">
                    <li><a href="#"><span class="entypo-home"></span></a>
                    </li>
                    <li>Página Inicial
                    
                    <li>Cadastrar Pessoa Fisica
                    </li>
                    <!--   <ul class="right inline-list">
                        <li>Help Center</a>
                        </li>
                        <li>Mail Support
                        </li>
                    </ul> -->
                </ul>
                <!-- end of breadcrumbs -->


        <div class="row">
                                    
                                    <div class="large-9 columns">
                                       
                                        <h2> ${sucesso}</h2>
                                        <form data-abide name="salvar" action="<%=request.getContextPath()%>/SalvarPessoaFisica" method="POST">
                                            <h5> Cadastro de Pessoa Física</h5> 
                                            <div class="id-field">
                                              
                                            <input type="hidden" name="idfisica" value="${pessoafisica.idFisica}" readonly="readonly" /></br></br>
                                                 
                                            </div>
                                                 
                                            <div class="name-field">
                                              
                                                <label>Nome <small>required</small>
                                                    <input type="text" name="nomefisica" value="${pessoafisica.nomeFisica}" required pattern="[a-zA-Z]+"/>
                                                </label>
                                                <small class="error">Digite o Nome</small>
                                            </div>
                                                
                                                  <div class="sexo-field">
                                                <label>Sexo <small>required</small>
                                                    </br></br>
                                                    <input type="radio" name="sexofisica" value="${pessoafisica.sexoFisica}" id="feminino">
                                                    <label for="feminino">Feminino</label>
                                                    <input type="radio" name="sexofisica" value="${pessoafisica.sexoFisica}" id="masculino">
                                                    <label for="masculino">Masculino</label>
                                                </label>
                                           </div> 
                                                    </br> 
                                                 <div class="rg-field">
                                                     
                                                <label>RG <small>required</small>
                                                    <input type="text" name="rgfisica" value="${pessoafisica.rgFisica}" required pattern="\d{2}\.\d{3}\.\d{3}-[A-Z0-9]{1,2}"/>
                                                </label>
                                                <small class="error">Digite o RG</small>
                                            </div>
                                           <div class="cpf-field">
                                                <label>CPF <small>required</small>
                                                    <input type="text" name="cpffisica" value="${pessoafisica.cpfFisica}" required pattern="\d{3}\.\d{3}\.\d{3}-\d{2}" placeholder="000.000.000-00" />
                                                </label>
                                                <small class="error">Digite o CPF</small>
                                            </div>
                                            
                                             <div class="data-field">
                                                <label for="datanascimentofisica">Data de Nascimento <small>required</small></label>
                                                    <input type="date" name="datanascimentopessoafisica" placeholder="00/00/0000" value="${pessoafisica.dataNascimentoFisica}" />
                                                
                                               
                                            </div>
                                            
                                           <div class="estadocivil-field">
                                                <label>Estado Civil <small>required</small>
                                                    </br></br>
                                                    <input type="radio" name="estadocivilfisica" value="${pessoafisica.estadoCivilFisica}" id="solteiro">
                                                    <label for="solteiro">Solteiro(a)</label>
                                                    <input type="radio" name="estadocivilfisica" value="${pessoafisica.estadoCivilFisica}" id="casado">
                                                    <label for="casado">Casado(a)</label>
                                                </label>
                                           </div>
                                                    
                                            <div class="id-field">
                                              
                                            <input type="hidden" name="idpessoa" value="${pessoafisica.idPessoa}" readonly="readonly" /></br></br>
                                                 
                                            </div>
                                            <button type="submit" class="tiny" value="Salvar" name="cadastrar">Enviar</button>
                                        </form>




                                    </div>
                                </div>
                <!-- Container Begin -->
                
            <!-- close the off-canvas menu -->
            <a class="exit-off-canvas"></a>
            <!-- End of Right Menu -->
        </div>
        <!-- end paper bg -->

    </div>
   



    <!-- main javascript library -->
    <script type='text/javascript' src="${pageContext.request.contextPath}/adm/js/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/adm/js/waypoints.min.js"></script>
    <script type='text/javascript' src='${pageContext.request.contextPath}/adm/js/preloader-script.js'></script>
    <!-- foundation javascript -->
    <script type='text/javascript' src="${pageContext.request.contextPath}/adm/js/foundation.min.js"></script>
    <script type='text/javascript' src="${pageContext.request.contextPath}/adm/js/foundation/foundation.#111111.js"></script>
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

    <script type="text/javascript">
    
    function validarSenha(){
                $('#senha1').val()
                $('#senha2').val()

                if (senha1 == senha2)
                    alert("SENHAS IGUAIS")
                else
                    alert("SENHAS DIFERENTES")
            }

            var ratings = $(".rating");
            if (ratings.length > 0) ratingStars(ratings);
            function ratingStars(stars) {
                $.each(stars, function(i, obj) {
                    var field = $(obj).find("input");

                    $(obj).rating({
                        field: field,
                        maxvalue: 5,
                        curvalue: field.val()
                    });
                });
            }
    
    
    </script>


    <script>
    $(document).foundation();
    </script>



</body>

</html>
