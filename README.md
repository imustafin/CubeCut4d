#CutTesseract v0.0-w-rotations

## Выбор режим задавания гиперплоскости сечения. Варианты:
	2: Точка и вектор нормали гиперплоскости
	4: Четыре четырёхмерных точек
	0: Сечение не нужно
Примеры:
    2
    0 0 0 0
    1 1 1 1

Значит, что мы задаём гиперплоскость точкой (0, 0, 0, 0) и
вектором нормали плоскости {1, 1, 1, 1}

    4
    1 1 0.5 1
    1 -1 1 1
    1 1 -1 1
    -1 0 0 0

Значит, что мы задаём гиперплоскость четыремя точками:
(1, 1, 0.5, 1) 
(1, -1, 1, 1)
(1, 1, -1, 1)
(-1, 0, 0, 0)

2. После ввода данных откроется главое окно программы.

Изображение можно передвигать левой кнопкой мыши.
Изображение можно поворачивать в YZ и XZ осях средней кнопкой мыши.
Изображение можно поворачивать в YW и XW осях правой кнопкой мыши.

Колёсико мышки позволяет масштабировать изображение.

Клавиша Z поворачивает сечение так, что оно вкладывается в трёхмерное пространство.
Следует использовать только правую кнопку мыши для вращения изображения для
сохранения этого свойства.

Клавиша C включает/выключает изображение тессеракта.

