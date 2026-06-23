#include <iostream>
#include <string>

template <class T>

void BubbleSort(T list[], int& n)
{
    for (size_t i{0}; i < n - 1; i++)
    {
        for (size_t j{0}; j < (n - i - 1); j++)
        {
            if (list[j] > list[j + 1])
            std::swap(list[j], list[j + 1]);
        }
    }
}

template <class T>

void DisplayArray(T list[], int& size)
{
    for (size_t i{0}; i < size; i++)
    std::cout << '\n' << list[i] << " ";
}

int main()
{
    // integer array
    int n{10};
    int integers[n] = {5, 1, 4, 2, 8, 3, 7, 8, 10, -3};
    BubbleSort(integers, n);
    DisplayArray(integers, n);

    // ------------------------------------------

    // float array
    int k{3};
    float floats[k] = {3.65, 8.91, -1.4};
    BubbleSort(floats, k);
    DisplayArray(floats, k);

    // ------------------------------------------

    // chars array
    int m{5};
    char characters[m] = {'a', 'c', 'H', 'd', 'L'};
    BubbleSort(characters, m);
    DisplayArray(characters, m);

    // ------------------------------------------

    // string array
    int q{5};
    std::string strings[q] = {"Test", "case", "for", "string", "templates"};
    BubbleSort(strings, q);
    DisplayArray(strings, q);

}