# ToyDonation

<p>Essse projeto "Toy Donation" está sendo desenvolvido durante esse bimestre pelas alunas Flavia Morgado e Laura Cristine Silva. Ele tem como objetivo conscientizar crinças e seus reponsáveis sobre a importância de doar brinquedos, a forma certa de doar e o que isso pode interferir em nossas vidas a curto e longo prazo, assim em conjunto estimulando o nosso público a doar. Abordaremos esse tema utilizando a imagem do filme "Toy Story" onde os brinquedos estaram "falando/ensinando" tudo isso de uma forma divertida e positiva.</p>
<p></p>Inicialmente a tela inicial será uma tela de entrada, e tela principal será aonde os titulos dos tópicos serão expostos, sendo esses: Porque Doar, Como Doar, Onde Doar e Beneficios de doar. Na tela "Porque doar" estamos expondo o porque é importante doar assim, em cojunto trazemos a conscientização; já na tela "Como Doar" estamos explicando o estado em que o brinquedo deve estar, e o que fazer antes dele ser doado; na tela 'Onde Doar" é a parte que expõe a nossa instituição "parceira" onde os usuarios terão ela como uma "dica" de onde doar; e na tela "Beneficios" mostramos o que o seu ato pode influenciar a longo e a curto praazo. </p>
<p>Caso o usuário se interesse ele irá clicar no titulo e será enviado para a tela que aborda tópico escolhido. Os  usuários poderam fazer cadastro e login para terem acesso ao seu perfil onde poderá tirar fotos dos brinquedos que vão ser doados. A tela "cadastro" será aonde o usuario fará o seu cadastro no aplicativo e então ele irá para a tela de 'Login" onde poderá se logar e ter acesso ao seu perfil que terá suas informações.</p>

 - Sensores: Nossa ideia inicial é que quando o usuário "sacudir" o celular de um lado para o outro a bolinha da pixar passe na tela dele caso ele esteja no dentro do aplicativo.

 - Acesso ao Hardware: Inicialmente pensamos em abrir a câmera do celular para poder tirar fotos dos brinquedos que os usuários irão doar.

 - Preferencias do usuário: Vamos fazer o aplicativo em modo claro e modo escuro. 

 - Saved instance: Iremos guadar os dados como (nome, localização, email, e telefone) do usuário.


![diagrama de classes toy donation](https://github.com/FlaviaAMorgado/ToyDonation/assets/127445372/9b41077c-7045-4782-a2fb-5113d44502e9)

 - Protótipo Toy Donation:
 [protótipotoydonation (1).pdf](https://github.com/FlaviaAMorgado/ToyDonation/files/12317801/prototipotoydonation.1.pdf)


<p>É necessário o conectar com banco de dados, fazer um sistema e adicionar mais funções que serão ensinadas em sala de aula. Porém essas já estão nos nosso planos para fazer as melhorias e incrementação do nosso aplicativo expositivo sobre a sustentabilidade.</p>

- Aplicativo rodando, tanto no celular, quanto no emulador:
  


https://github.com/FlaviaAMorgado/ToyDonation/assets/127424225/705a5876-4775-4bfa-9f22-227177dda255



https://github.com/FlaviaAMorgado/ToyDonation/assets/127424225/d838d83e-e665-40ac-b7bf-f0d179a91237

<hr>
<h3> Incrementação de Sensores </h3>
<p>Foi incrementado no aplicativo o sensor "acelerômentro", que tem como objetivo fornecer dados sobre a aceleração do aparelho, se baseando nos eixos X, Y e Z. Em resumo, o mesmo ao movimentar o aparelho, retorna uma ação, no caso do nosso aplicativo, ao movimentar o celular, o mesmo troca as imagens das personagens da temática abordada. </p>
- Passo a passo:
<p>Foi necessário implementar ao código (no nosso caso em uma nova activity destinada somente para isso) o "SensorEventListener" e declarar o "SensorManager", o "sensor" e a ImageView que foi utilizada para ajudar na troca de imagens.</p>
<p>Logo em seguida utilizamos o seguinte comando "sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);" para acessar o sensor, e declaramos o tipo dele, que é o acelerômetro, por meio do "sensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);"</p>
<p>Foi utilizada uma função que tem como objetivo trocar a imagem enquanto o celular se movimenta, o  "img_Random();" (dentro dela as nossas imagens) e por fim o código "int random_toys = random.nextInt(toys.length);" que gera números aleatórios para as imagens.</p>

- Aplicativo com a incrementação dos sensores rodando, tanto no celular, quanto no emulador:

https://github.com/FlaviaAMorgado/ToyDonation/assets/127424225/953428be-c7c3-45fe-84be-eeb48be434c9


https://github.com/FlaviaAMorgado/ToyDonation/assets/127424225/4ec71749-61f5-46a2-8f02-b415f3811cb6

  (obs: diferente posições dos botões, no celular e no emulador)

