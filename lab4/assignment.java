const webDevQuiz = [
  {
    question: "What is the capital of AUSTRALIA?",
    answer: "SYDNEY",
  },
  {
    question: "Which is the Smallest country in world ?",
    answer: "VATICAN CITY",
  },
  {
    question: "Which is the largest ocean ?",
    answer: "pacific ocean",
  },
  {
    question: "What is the sum of 100+100?",
    answer: 198,
  },
  {
    question: "What is the name of richest person in world ?",
    answer: "Elon Musk",
  }
];

function quiz() {
    let score = 0;
    for(let i = 0; i < webDevQuiz.length; i++) {
        let userAnswer = prompt(webDevQuiz[i].question);

        if(userAnswer.toLowerCase() == webDevQuiz[i].answer.toLowerCase()) {
            score++;
            alert("Correct Answer!");
        } else {
            alert(`Wrong Answer! The correct answer is: ${webDevQuiz[i].answer}`);
        }
    }   
    alert(`Quiz Over! Your total score is: ${score} out of ${webDevQuiz.length}`);
}

quiz();