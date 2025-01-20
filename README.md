## HorizontalLayoutContainer
Show items on one row while keeping content in the row aligned vertically across the items.

## Features
- Show items horizontally using a datasource
- Configure multiple widget drop zones
- Ensure the content in each drop zone is aligned vertically across the items
- By default the items are spaced evenly horizontally

## Limitations
- Intended to be used for small lists.
- All datasource items are rendered at once.
- No click handling, configure it on your content using a container where necessary

## Usage
- Place the widget on a page or snippet
- Configure the datasource
- Configure content items, these become drop zones on your page design
- Optionally add a class of your own on the items to configure their width

## Additional styling to make input elements resize

Input elements may not resize horizontally like you expect it to. In the test app I added this class on the input widget to make it resize to the maximum available space in the item:

``` CSS
.input-full-width {
    input {
        width: 100%;
    }
}
```

You may need different custom styling to make your design work so this is not a one-size-fits-all solution.

## Example

Download the demo app from the [github repo](https://github.com/Itvisors/mendix-HorizontalLayoutContainer) for an example. Just download the entire repository using the `Code` button and extract the downloaded zip. The test folder contains the Mendix app





