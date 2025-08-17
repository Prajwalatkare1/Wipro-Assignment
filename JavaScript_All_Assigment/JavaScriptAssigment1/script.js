document.addEventListener('DOMContentLoaded', () => {
  const quizData = [
    {
      question: "Which keyword declares a constant variable in JavaScript?",
      options: ["var", "let", "const"],
      answer: "const"
    },
    {
      question: "What does 'DOM' stand for in JavaScript?",
      options: ["Document Object Model", "Data Object Management", "Digital Output Module"],
      answer: "Document Object Model"
    },
    {
      question: "Which method converts a JSON string to a JavaScript object?",
      options: ["JSON.parse()", "JSON.stringify()", "JSON.toObject()"],
      answer: "JSON.parse()"
    }
  ];

  const startBtn = document.getElementById('start-btn');
  const resultsDiv = document.getElementById('results');
  const scoreSpan = document.getElementById('score');
  const totalQuestionsSpan = document.getElementById('total-questions');

  totalQuestionsSpan.textContent = quizData.length;

  startBtn.addEventListener('click', startQuiz);

  function startQuiz() {
    let score = 0;
    
    const name = prompt("What is your name?");
    if (!name || name.trim() === '') {
      alert("Please enter a valid name to continue.");
      return;
    }

    if (!confirm(`Hi ${name.trim()}! Are you ready for the quiz?`)) {
      alert("Quiz cancelled. You can start again whenever you're ready.");
      return;
    }

    quizData.forEach((questionObj, index) => {
      const userAnswer = prompt(
        `${index + 1}. ${questionObj.question}\n\n` +
        `Options:\n${questionObj.options.map((opt, i) => `${i + 1}) ${opt}`).join('\n')}\n\n` +
        `Enter the number of your answer:`
      );

      if (userAnswer === null) {
        alert("Quiz cancelled.");
        return;
      }

      const selectedOption = questionObj.options[parseInt(userAnswer) - 1];
      if (selectedOption === questionObj.answer) {
        score++;
        alert("Correct! 🎉");
      } else {
        alert(`Incorrect. The correct answer is: ${questionObj.answer}`);
      }
    });

    showResults(score);
  }

  function showResults(score) {
    scoreSpan.textContent = score;
    resultsDiv.style.display = 'block';
    
    const percentage = (score / quizData.length) * 100;
    let message;
    
    if (percentage === 100) {
      message = "Perfect score! You're a JavaScript expert!";
    } else if (percentage >= 70) {
      message = "Good job! You know your JavaScript basics well.";
    } else {
      message = "Keep practicing! JavaScript gets easier with time.";
    }
    
    alert(message);
  }
});