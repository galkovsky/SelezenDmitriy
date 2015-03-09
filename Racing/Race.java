package com.company;

public class Race {
    Car[] cars;
    int length;

    public Race(int length, Car[] cars) {
        this.length = length;
        this.cars = cars;
    }

    public void start() {
        boolean isFinished = false;
        while (!isFinished) {
            for (int i = 0; i < cars.length; i++) {
                cars[i].move();
                for(int j = 0; j < cars.length; j++){
                    if(cars[j].position >= length)
                        sortDown(cars);
                }
            }
            showArr(cars);

            if (cars[0].position >= length && cars[0].position > cars[1].position) {
                System.out.println(cars[0] + " has finished 1st");
                isFinished = true;
            }

        }
    }

    public void sortDown(Car[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i].position < arr[j].position) {
                    Car tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    public void showArr(Car[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i].name + " " + arr[i].position + " | ");
        }
        System.out.println();
    }
}
