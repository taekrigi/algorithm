function solution(clothes) {
  const sizesPerCloth = clothes.reduce((acc, cur) => {
    const [name, type] = cur
    acc[type] = (acc[type] || 0) + 1
    return acc
  }, {})

  const sizes = Object.values(sizesPerCloth)

  const sum = sizes.reduce((_sum, size, index) => {
    const calculator = sizes
      .filter((s, i) => i > index)
      .map((s) => s + 1)
      .reduce((acc, cur) => acc * cur, size)

    return _sum + calculator
  }, 0)

  return sum
}
