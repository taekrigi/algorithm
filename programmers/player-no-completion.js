// https://programmers.co.kr/learn/courses/30/lessons/42576?language=javascript#

function solution(participant, completion) {
  const sortedParticipant = participant.sort()
  const sortedCompletion = completion.sort()

  return sortedParticipant.find((p, index) => p !== sortedCompletion[index])
}
