const score = JSON.parse(localStorage.getItem('score'));

function reset(){
  score.win=0;
  score.tie=0;
  score.lose=0;
}


function playGame(playerMove){
  playerDecision=playerMove;
  const compDecision=Math.random();
  let result='';
  let res='';
  if(compDecision>=0 && compDecision<1/3){result='ROCK'}
  else if(compDecision>=1/3 && compDecision<2/3){result='PAPER'}
  else {result='SCISSOR'}

  if(playerMove === result){
    res='TIE';
    score.tie+=1;
    console.log('TIE');}
    else if ((playerMove === 'ROCK' && result === 'SCISSOR')||(playerMove === 'SCISSOR' && result === 'PAPER')||(playerMove === 'PAPER' && result === 'ROCK')){
    res='WIN';
    score.win+=1;
    console.log('WIN');}
  else{
    res='LOSE';
    score.lose+=1;
    console.log('LOSE')}
    alert(`Result: ${res} \n Computer choose:${result} and You Choose: ${playerDecision} \n Win: ${score.win}, Lose: ${score.lose}, Tie: ${score.tie} \n BETTER LUCK NEXT TIME !!`)
    return playGame;
  }
  
  localStorage.setItem('score',JSON.stringify(score))
