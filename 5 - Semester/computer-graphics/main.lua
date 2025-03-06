local love = require("love")

function love.load()
  love.window.setTitle("Trabalho de Computação Gráfica I - Bandeira do Brasil")
  love.window.setMode(800, 600)
  love.graphics.setBackgroundColor(0.5, 0.5, 0.5)
end

function love.draw()
  -- Draw a green rectangle
  love.graphics.setColor(0, 1, 0)
  love.graphics.rectangle("fill", 10, 10, 780, 580)

  -- Draw a opposite yellow triangles
  love.graphics.setColor(1, 1, 0)
  love.graphics.polygon("fill", 400, 50, 50, 300, 750, 300)
  love.graphics.polygon("fill", 50, 300, 750, 300, 400, 550)

  -- Draw a blue circle
  love.graphics.setColor(0, 0, 1)
  love.graphics.circle("fill", 400, 300, 150, 100)

  -- Draw a white stars
  local estrelas = {
    { 420, 250 }, { 450, 270 }, { 430, 300 }, { 460, 320 }, { 490, 310 },
    { 330, 360 }, { 360, 370 }, { 390, 360 }, { 360, 390 },
    { 300, 280 }, { 330, 290 }, { 290, 310 }, { 320, 320 }, { 350, 330 },
    { 380, 340 }, { 410, 345 }, { 440, 340 }, { 470, 330 },
    { 280, 370 }, { 310, 380 }, { 340, 390 },
    { 500, 290 }, { 530, 310 }, { 550, 330 }, { 520, 350 }
  }


  love.graphics.setColor(1, 1, 1)
  for _, estrela in ipairs(estrelas) do
    love.graphics.circle("fill", estrela[1], estrela[2], 3, 100)
  end

  -- Draw a white arc
  love.graphics.setColor(1, 1, 1)
  love.graphics.setLineWidth(30)
  love.graphics.arc("line", "open", 380, 450, 200, math.rad(225), math.rad(340), 100)

  love.graphics.push()
  love.graphics.translate(552, 310)
  love.graphics.rotate(math.rad(16))
  love.graphics.setColor(1, 1, 0)
  love.graphics.rectangle("fill", 0, 0, 50, 100)
  love.graphics.pop()

  love.graphics.push()
  love.graphics.translate(198, 270)
  love.graphics.rotate(math.rad(357))
  love.graphics.setColor(1, 1, 0)
  love.graphics.rectangle("fill", 0, 0, 50, 100)
  love.graphics.pop()
end

function love.keypressed(key)
  if key == "escape" then
    love.event.quit()
  end
end
