Some tools to help make sure you're not writing card holder data to disk.

The payment industry [PCI](https://www.pcisecuritystandards.org/) standards prohibit storing things like:

* Card track data
* PANs
* PIN blocks

Having a source of fake data means you can test your scripts/tools that check this kind of data is not being persisted.